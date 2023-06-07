package chineseproducer;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;


public class ChineseActivator implements BundleActivator, ServiceListener {

	private static final Object Chinese = null;
	private static BundleContext context;
	ServiceRegistration serviceRegistration;
	
	static BundleContext getContext() {
		return context;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		ChineseInterface Chinese = new ChineseImpl();
		
		serviceRegistration = context.registerService(ChineseInterface.class.getName(), Chinese, null);
		
		System.out.println("Welcome to Chinese Restaurant\n");
		
		Chinese.ChineseService();
	}

	@Override
	public void start(BundleContext context) throws Exception {
		
		ChineseInterface Chinese = new ChineseImpl();
		
		serviceRegistration = context.registerService(ChineseInterface.class.getName(), Chinese, null);
		
		System.out.println("Chinese producer started\n");
		
		Chinese.ChineseService();
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		System.out.println("Chinese producer finished\n");
		
		serviceRegistration.unregister();
	}

	public void serviceChanged(ServiceEvent ev) {
		
	}


}
