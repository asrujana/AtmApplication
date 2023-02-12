package atm_application;

import java.util.Scanner;


public class Cases {

	int balance=10000;
	void cases(){
		
		Scanner sc =new Scanner(System.in);
		int choice =sc.nextInt();
		switch(choice){ 
			
			case 1:
				System.out.println(" ENTER YOUR WITHDRAW MONEY ");
				int withdraw=sc.nextInt();
				
				
	            if(withdraw >balance) {
					System.out.println(" Their is no suffinet amount ");
				}
	            else {
	            	balance=balance-withdraw;
	            	System.out.println(" Collect your money ");
	            	System.out.println(" Your money is sucessfully withdraw ");
	            	System.out.println(" --------- Now your balance is " + balance + "-------- " );
	            }
	            Menu.menu();
				cases();
				break;
			case 2:
				System.out.println(" ENTER YOUR DEPOSIT MONEY ");
				int deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println(" ---------- now your balance is " + balance+ "-------- " );
				Menu.menu();
				cases();
				break;
			case 3:
				System.out.println(" ------------YOUR BALANCE IS " + balance +"------------ ");
				Menu.menu();
				cases();
				break;
			case 4:
				System.out.println(" ---------------------- THANK YOU ----------------------");
				System.out.println("");
				
				
				Front.front();
				Menu.menu();
			cases();
				
				
				break;
				default :
					System.out.println("Please enter correct number");
		Menu.menu();
				cases();
		}

	}

}
