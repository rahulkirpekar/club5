package oops.abstopic.interfacetopic;

import java.util.Scanner;

public class TestApp1 
{
	public void getVehicleBasedInfo(Vehicle vehicle) 
	{
		if (vehicle instanceof TwVehicle) 
		{
			vehicle.getSpec();
			TwVehicle tw = (TwVehicle)vehicle;
			tw.getTwInfo();
			
		}else if(vehicle instanceof LmvVehicle) 
		{
			vehicle.getSpec();
			LmvVehicle lmv = (LmvVehicle)vehicle;
			lmv.getLmvInfo();
			
		}else if(vehicle instanceof	HmvVehicle) 
		{
			vehicle.getSpec();
			HmvVehicle hmv = (HmvVehicle)vehicle;
			hmv.getHmvInfo();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TestApp1 t = new  TestApp1();
		System.out.println("Enter below choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		
//		Vehicle v = null;
		
		switch(choice) 
		{
					// Polymorphic Object---s
				    // Upcasting--[Parent referece = new Child Object]
			case 1: 
					TwVehicle tw = new TwVehicle();
					t.getVehicleBasedInfo(tw);
					
//					v =  new TwVehicle();
//					v.getSpec();
					
					// Downcasting--[Parent refernece --->convert into ChildObject]
//					v.getTwInfo();
					
//					TwVehicle tw = (TwVehicle)v;
//					tw.getTwInfo();
					break;
			case 2: 
					LmvVehicle lmv = new LmvVehicle();
					t.getVehicleBasedInfo(lmv);
					
//					v = new LmvVehicle();
//					v.getSpec();
					
					// Downcasting
//					LmvVehicle lmv = (LmvVehicle)v;
//					lmv.getLmvInfo();
					break;
			case 3: 
					HmvVehicle hmv = new HmvVehicle();
					t.getVehicleBasedInfo(hmv);
//					v = new HmvVehicle();
//					v.getSpec();
//
//					HmvVehicle hmv = (HmvVehicle)v;
//					hmv.getHmvInfo();
					break;
		}
	}
}