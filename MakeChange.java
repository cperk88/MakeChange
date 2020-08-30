package MakeChange;

import java.util.Scanner;

public class MakeChange {
	// tender denominations
//	double twenty = 20.0, ten = 10.0, five = 5.0, one = 1.0, qtr = 0.25, dime = 0.10, 
//			nick = 0.05, pen = 0.01;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// price & tender decl
		double price, tender;
		
		// prompt user for price and tender
		System.out.print("Enter Price: ");
		price = sc.nextDouble();
		System.out.println();

		System.out.print("Amount Tendered: ");
		tender = sc.nextDouble();
		System.out.println();

		// calc change due
		double due = tender - price;
		
		// tender & change due messages
		if (due == 0) {
			System.out.println("No Change Due. ");

		} else if(due < 0) {

			System.out.println("Insufficient Amount Tendered. ");

		} else if(due > 0) {

			changeDenom(due);
		}
			
		sc.close();
		}
		
		public static void changeDenom(double due) {
			System.out.println("Return Change in the Following Denominations: \n");

			if(due > 19) {			
				double num_of_20 = (due - (due %20))/20;
				System.out.println("Twenty / Twenties: "+num_of_20);
				due -= (num_of_20 * 20);
			}

			if(due > 9) {			
				double num_of_10 = (due - (due %10))/10;
				System.out.println("Ten(s): "+ num_of_10);
				due -= (num_of_10 * 10);
			}
			
			if(due > 4) {			
				double num_of_5 = (due - (due %5))/5;
				System.out.println("Five(s): " + num_of_5);
				due -= (num_of_5 * 5);
			}
			
			if(due >= 1) {			
				double num_of_1 = (due - (due %1))/1;
				System.out.println("One(s): " + num_of_1);
				due -= (num_of_1 * 1);
			}

			if(due > 0.24) {			
				double num_of_qtr = (due - (due %0.25))/0.25;
				System.out.println("Quarter(s): " + num_of_qtr);
				due -= (num_of_qtr * 0.25);
			}
			
			if(due > 0.09) {			
				double num_of_dime = (due - (due %0.1))/0.1;
				System.out.println("Dime(s): " + num_of_dime);
				due -= (num_of_dime * 0.1);
			}
			
			if(due > 0.04) {			
				double num_of_nick = (due - (due %0.05))/0.05;
				System.out.println("Nickel(s): " + num_of_nick);
				due -= (num_of_nick * 0.05);
			}
			
			if(due >= (.01)) {			
				double num_of_pen = (due - (due %0.01))/0.01;
				due -= (num_of_pen * 0.01);
				
				if((due < .01) && (due > .00999)){
					num_of_pen += 1;
				}
				System.out.println("Penny / Pennies: " + num_of_pen);
		}
	}
}