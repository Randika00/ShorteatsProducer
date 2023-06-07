package chineseproducer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChineseImpl implements ChineseInterface{

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	int tot = 0;
	int qty = 0;
	String type;
	
	@Override
	public void ChineseService() {

		try {
			
			System.out.println("Chinese Food\t\tPrice\nAppetizers\t\t800\nSoup\t\t\t500\nFried Rice\t\t700\nChopSuey\t\t750\nPazta\t\t\t850\n\n");
			
			System.out.println("Enter the Chinese Food  you wanted: ");
			type = br.readLine();
			
			
			System.out.println("\nEnter the quantity you required: ");
			qty = br.read();
			
			
			if(type.equalsIgnoreCase("Appetizers"))
			{
				tot = 850 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Soup"))
			{
				tot = 500 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Fried Rice"))
			{
				tot = 700 * (qty-48);
			}
			else if(type.equalsIgnoreCase("ChopSuey"))
			{
				tot = 750 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Sausage"))
			{
				tot = 350 * (qty-48);
			}
			
			
			System.out.println("\nTotal payable: " +tot + "\n\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
