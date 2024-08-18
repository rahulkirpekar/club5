package oops.polymorphismtopic.runtime.task1;

public class TwVehicle extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("TwVehicle :: getSpec()");
	}
	
	public void getTwInfo() 
	{
		System.out.println("TwVehicle :: getTwInfo()");
	}
}
