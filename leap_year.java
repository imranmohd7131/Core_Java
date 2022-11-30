package leap_year;
import java.util.Scanner;
public class leap_year {
public static void main(String[] args) {
	Scanner ob= new Scanner(System.in);
	System.out.println("Enter year");
	int year=ob.nextInt();
	if(year%4==0 && year%100!=0)
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
	main(args);
	/*if(num%4==0 && num%100==0 || num%400==0)
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("Not a leap year");
	}*/
	/*int year = ob.nextInt();
	boolean flag = false;
    if(year % 400 == 0)
    {
        flag = true;
    }
    else if (year % 100 == 0)
    {
        flag = false;
    }
    else if(year % 4 == 0)
    {
        flag = true;
    }
    else
    {
        flag = false;
    }
    if(flag)
    {
        System.out.println("Year "+year+" is a Leap Year");
    }
    else
    {
        System.out.println("Year "+year+" is not a Leap Year");
    }*/
}
}
