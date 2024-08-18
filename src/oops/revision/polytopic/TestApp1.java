package oops.revision.polytopic;

import java.util.Scanner;

public class TestApp1 
{
	//							Upcasting
	public void getVehicleInfo(Vehicle v) 
	{
		v.getSpec();
		
		if(v instanceof TwVehicle) 
		{
			// Downcasting
			TwVehicle tw = (TwVehicle)v;
			tw.getTwInfo();
			
		}else if(v instanceof LmvVehicle) 
		{
			// Downcasting
			LmvVehicle lmv = (LmvVehicle)v;
			lmv.getLmvInfo();
			
		}else if(v instanceof 	HmvVehicle) 
		{
			// Downcasting
			HmvVehicle hmv = (HmvVehicle)v;
			hmv.getHmvInfo();
		}
	}
	public static void main(String[] args) 
	{
		TestApp1 t = new TestApp1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle Choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		
		switch(choice ) 
		{
			case 1: TwVehicle tw  = new TwVehicle();
					t.getVehicleInfo(tw);
					break;
					
			case 2: LmvVehicle lmv = new LmvVehicle();
					t.getVehicleInfo(lmv); 
					break;
					
			case 3: HmvVehicle hmv = new HmvVehicle();
					t.getVehicleInfo(hmv); 
					break;
		}
	}
}
