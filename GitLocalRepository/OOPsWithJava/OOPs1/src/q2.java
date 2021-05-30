/*
2. Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.*/
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.1");
		
		
		if(sc.hasNextDouble())
		{
			//System.out.println("enter no.2");
			Double n1=sc.nextDouble();
			Double n2=sc.nextDouble();
			System.out.println("Average is="+(n1+n2)/2);
		}
		else
		{
			System.out.println("error");
		}
		

	}

}
/*enter no.1
456
42.6
Average is=249.3


