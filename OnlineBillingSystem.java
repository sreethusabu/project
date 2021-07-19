 package Project1;
import java.util.Scanner;
public class OnlineBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Cosmetics";
		String str2="Textiles";
		String str3="Footwears";
		System.out.println("	INSIGHT WORLD ");
		System.out.println("			Women's Store");
		System.out.println("*****************************************************");
		System.out.println("	Welcome to INSIGHT WORLD Shopping ");
		System.out.println();
		System.out.println("Cosmetics 	Textiles 	Footwears	");
		System.out.println();
		System.out.println("Register to INSIGHT WORLD");
		Scanner sc=new Scanner(System.in);
		System.out.println("name:");
		String s1=sc.nextLine();
		System.out.println("HouseName:");
		String s2=sc.nextLine();
		System.out.println("city:");
		String s3=sc.nextLine();
		System.out.print("search:");
		String s4=sc.nextLine();
		banking e=new banking(s4,s1,s2,s3);
		System.out.println("*****************************************************");
		if(s4.equals(str1)||s4.equals(str2)||s4.equals(str3))
		{
			if(e.amount!=0)
			{
			
				e.order();
				e.details();
			}
			else
			{
				System.out.println("order cannot be placed since you have not selected any items");
			}
		}
		else
		{
		System.out.println("sorry we don't offer your request,please enter above mentioned items");
		
		}
		
		}

} 
