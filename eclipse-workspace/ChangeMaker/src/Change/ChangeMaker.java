package Change;

import java.util.Scanner;

public class ChangeMaker {
	

		
	public static void main(String[] args) {
			
		
			Scanner in = new Scanner(System.in);
			int amountToChange = 0;
			String str = "change \n";
			
			boolean run = true;
			while (run){ 
				System.out.println("Enter Amount:");
			    amountToChange = in.nextInt();
				if (amountToChange >0 && amountToChange < 100){
					
					run =false;
					
				}
			}
			
			//declare variables
			
			int quarters,dimes,nickels,pennies;
			
			
			
			 
			quarters = amountToChange/25;
			amountToChange = amountToChange % 25;
			if(quarters !=0) { 
				str += quarters + "  quarters \n";
			}
			
			dimes = amountToChange/10;
			amountToChange = amountToChange % 10;
			if(dimes !=0) { 
				str += dimes + "  dimes \n";
			}
			
			nickels = amountToChange/5;
			amountToChange = amountToChange % 5;
			if(nickels !=0) { 
				str += nickels + "  nickles \n";
			}
			
			pennies = amountToChange/1;
			if (pennies!=0) { str +=pennies + "  pennies \n";
		
		
			
		    }
			
			System.out.println(str);

	}
	}



