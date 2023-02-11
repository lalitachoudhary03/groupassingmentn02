package skyScarper;

import java.util.Scanner;

public class Scraper {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total number floors in the building:");
	int n=sc.nextInt();
	int day[]=new int[n+1];
	for(int i=1; i<=n; i++);
	{
		String size = null;
		System.out.println("Enter the floor size given on the day: "+size);
		int size1 = sc.nextInt();
		day[size1]=size1;
		
	}
	int temp =n;
	int flag;
	System.out.println("The order of construction is as follow");
	
	for (int i=1; i<=n; i++)
	{
		flag =0;
		System.out.println("Day"+i+":");
		while(temp>=1 && day[temp]<=i)
		{
			flag=1;
			System.out.println(temp + "");
			temp--;
		}
		if(flag==1)
			System.out.println();
	}
	}

}
