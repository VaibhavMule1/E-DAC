import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice=0;
		System.out.println(" 1. Dosa \n 2. samosa \n 3. upma \n 4. pohe \n 5. vadapav \n 6. khichadi \n 7. milkshake \n 8. ice cream \n 9. burger \n 10.sandwich \n ------------------------------------------- ");
		System.out.println("choose what to have :: ");
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		double bill=0;
//		sc.close();
		switch(choice)
		{
		case 1:
			System.out.println("how much pohe ");
			int qty1=sc.nextInt();
			
		    bill= 30*qty1;
//		    break;
		    
		case 2:
		System.out.println("how much samosa ");
		int qty2=sc.nextInt();
	    bill= 15*qty2 + bill;
	 //
	  //System.out.println(bill);
//	    break;
	    
		case 3:
		System.out.println("how much upma ");
		int qty3=sc.nextInt();
	    bill= 20*qty3 + bill;
//	    break;
		    
		case 4:
		System.out.println("how much pohe ");
		int qty4=sc.nextInt();
	    bill= 15*qty4 + bill;
	//    break;
	    
		case 5:
		System.out.println("how much vadapav  ");
		int qty5=sc.nextInt();
	    bill= 15*qty5 + bill;
	  //  break;
	    
		case 6:
		System.out.println("how much khichdi ");
		int qty6=sc.nextInt();
	    bill= 15*qty6 + bill;
	    //break;
	    
		case 7:
		System.out.println("how much milkshake ");
		int qty7=sc.nextInt();
	    bill= 15*qty7 + bill;
	    //break;
	    
		case 8:
		System.out.println("how much ice cream ");
		int qty8=sc.nextInt();
	    bill= 15*qty8 + bill;
	    //break;
	    
		case 9:
		System.out.println("how much burger ");
		int qty9=sc.nextInt();
	    bill= 15*qty9 + bill;
	    //break;
	    
		case 10:
		System.out.println("how much sandwich ");
		int qty10=sc.nextInt();
	    bill= 15*qty10 + bill;
	   // break;
	    
		case 11:
		
		System.out.println(" Total bill = "+bill);
		 break;
		}
		
		
	}

}
