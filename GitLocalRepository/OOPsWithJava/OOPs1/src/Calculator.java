
import java.util.Scanner;

class Calculator
{
 public static void main(String[] args)
	{ 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number1 ");
	System.out.println("enter number2 ");
	double n1=sc.nextDouble();
	double n2=sc.nextDouble();
	int choice=0;
	
	System.out.println("enter choice ");
	System.out.println("1)Addition ");
	System.out.println("2)multiplication ");
	System.out.println("3)division");
	System.out.println("4)substraction ");
	System.out.println("5)exit");
	choice=sc.nextInt();
	double result=0;
	switch(choice)
		{
			case 1 :
				result=n1+n2;
				System.out.println("sum = "+result);
				break;			

			case 2 :
				result=n1*n2;
				System.out.println("multiplication = "+result);
				break;
			
			case 3 :
				result=n1/n2;
				System.out.println("division = "+result);
				break;	
			
			case 4 :
				result=n1-n2;
				System.out.println("subtraction = "+result);
				break;
			
			case 5 :
				break;
		}
	
	
	}
 
}
//package day01;
//import java.util.Scanner;
//public class Qno2 {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no.1");
//		
//		
//		if(sc.hasNextDouble())
//		{
//			//System.out.println("enter no.2");
//			Double n1=sc.nextDouble();
//			Double n2=sc.nextDouble();
//			System.out.println("Average is="+(n1+n2)/2);
//		}
//		else
//		{
//			System.out.println("error");
//		}
//		
//
//	}
//
//}
