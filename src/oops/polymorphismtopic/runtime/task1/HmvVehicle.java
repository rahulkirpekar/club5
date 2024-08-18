package oops.polymorphismtopic.runtime.task1;

public class HmvVehicle extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("HmvVehicle :: getSpec()");
	}
	public void getHmvInfo() 
	{
		System.out.println("HmvVehicle :: getHmvInfo()");
	}
}
