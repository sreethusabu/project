package Project1;
import java.util.Scanner;
public class banking {
	String category,name,city,housename,pincode;
	String cos="Cosmetics";
	String tex="Textiles";
	String ft="Footwears";
	int a1=0,a2=0,a3=0,a4=0,amount;
	
	//int a[];	
banking(String a,String l1,String l2,String l3)
{
	category=a;
	name=l1;
	housename=l2;
	city=l3;
	if(category.equals(cos))
	{
		Cosmetics();
	}
	else if(category.equals(tex))
	{
		Textiles();
	}
	else if(category.equals(ft))
	{
		Footwears();
	}
	
	
	
}

void Cosmetics()
{	System.out.println("Select your items:");
	System.out.println("press '1' :Lipsticks");
	System.out.println("press '2':EyeShadow");
	System.out.println("press '3':Foundation");
	System.out.println("press '4': Eyeliner");
	System.out.println("press '5' to place order");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num==1)
	{  
		
		System.out.println("Cost of 1 lipstick=400");
		System.out.println("enter the quantity");
		int quantity=s.nextInt();
		a1=(400*quantity);
		System.out.println("Amount:"+a1);
		Cosmetics();
	}
	
	if(num==2)
	{    
		
		 System.out.println("Cost of 1 Eyeshadow=350");
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a2=(350*quantity1);
			System.out.println("Amount:"+a2);
			Cosmetics();
			 
	}
	if(num==3)
	{
		
		 System.out.println("Cost of 1 Foundation=450");
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a3=(450*quantity1);
			System.out.println("Amount:"+a3);
			 Cosmetics();
	}
	if(num==4)
	{
		
		 System.out.println("Cost of 1 Eyeliner=150");
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a4=(150*quantity1);
			System.out.println("Amount:"+a4);
			 Cosmetics();
	}
	if(num==5)
	{
		System.out.println("***************************************************");
		amount=a1+a2+a3+a4;
		System.out.println("Total amount="+amount);
		
	}	
}
void Footwears()
{
	System.out.println("Select your brand");
	System.out.println("press '1' :Puma");
	System.out.println("press '2':Adidas");
	System.out.println("press '3':Nike");
	System.out.println("press '4': Fila");
	System.out.println("press'5' to place order");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num==1)
	{   System.out.println("Cost of 1 Puma footwear=1500");
		System.out.println("enter the size");
		int r=s.nextInt();
		System.out.println("enter the quantity");
		int quantity=s.nextInt();
		a1=(1500*quantity);
		System.out.println("Amount:"+a1);
		Footwears();
	}
	if(num==2)
	{
		 System.out.println("Cost of 1 Adidas footwear=2050");
		 System.out.println("enter the size");
			int r1=s.nextInt();
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a2=(2050*quantity1);
			System.out.println("Amount:"+a2);
			Footwears();
	}
	  
	if(num==3)
	{
		 System.out.println("Cost of 1 Nike footwear=4350");
		 System.out.println("enter the size");
			int r2=s.nextInt();
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a3=(4350*quantity1);
			System.out.println("Amount:"+a3);
			Footwears();
	}
	if(num==4)
	{
		 System.out.println("Cost of 1 Fila footwear=1350");
		 System.out.println("enter the size");
			int r3=s.nextInt();
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a4=(1350*quantity1);
			System.out.println("Amount:"+a4);
			Footwears();
	}
	if(num==5)
	{
		System.out.println("***************************************************");
		amount=a1+a2+a3+a4;
		System.out.println("Total amount="+amount);
	}
	
}
void Textiles()
{
	System.out.println("Select your item");
	System.out.println("press '1' :Churidhaar");
	System.out.println("press '2':Saree");
	System.out.println("press '3':Jeans");
	System.out.println("press '4': Gown");
	System.out.println("press'5' to place order");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num==1)
	{   System.out.println("Cost of 1 Churidhaarr=1000");
		System.out.println("enter the quantity");
		int quantity=s.nextInt();
		a1=(1000*quantity);
		System.out.println("Amount:"+a1);
		Textiles();
	}
	if(num==2)
	{
		 System.out.println("Cost of 1 Saree=2050");
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a2=(2050*quantity1);
			System.out.println("Amount:"+a2);
			Textiles();
	}
	  
	if(num==3)
	{
		 System.out.println("Cost of 1 Jeans=450");
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a3=(450*quantity1);
			System.out.println("Amount:"+a3);
			Textiles();
	}
	if(num==4)
	{
		 System.out.println("Cost of 1 Gown=1350");
			System.out.println("enter the quantity");
			int quantity1=s.nextInt();
			a4=(1350*quantity1);
			System.out.println("Amount:"+a4);
			Textiles();
	}
	if(num==5)
	{
		System.out.println("***************************************************");
		amount=a1+a2+a3+a4;
		System.out.println("Total amount="+amount);
	}
	
	
}

void order()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("How would you like to place the order");
	System.out.println("***************************************************");
	System.out.println("1=Cash on delivery");
	System.out.println("2=credit card purchase");
	int order=s1.nextInt();
	if(order==1)
	{
		cash();
	}
	else if(order==2)
	{
		credit();
	}
	else
	{
		System.out.println("invalid entry");
	}
}
void cash()
{
	System.out.println("Name: "+name);
	System.out.println("House name: "+housename);
	System.out.println("city: "+city);
	System.out.println("Your order is placed");
}
void credit()
{
	System.out.println("Name: "+name);
	Scanner k=new Scanner(System.in);
	System.out.println("enter the last 6 digits of your credit card");
	int num=k.nextInt();
	System.out.println("enter the UPI: ");
	int num1=k.nextInt();
	System.out.println("Your order is placed");
}

void details()
{
	System.out.println("press '1' to generate bill");
	System.out.println("press '2' to cancel the order");
	Scanner x=new Scanner(System.in);
	int num=x.nextInt();
	if(num==1)
	{
	System.out.println("********************************************************");
	System.out.println("	INSIGHT WORLD ");
	System.out.println("			Women's Store");
	System.out.println("*************************BILL**************************");
	System.out.println("Your order has been placed successfully and dispached");
	System.out.println("Name: "+name);
	System.out.println("House name: "+housename);
	System.out.println("city: "+city);
	System.out.println("Catogory: "+category);
	System.out.println("Total amount: "+amount);
	System.out.println("---------------------VISIT AGAIN---------------------");
	}
	else
	{
		System.out.println("ORDER IS CANCELLED");
	}
	
}
}