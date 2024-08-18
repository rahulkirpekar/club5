package oops.polymorphismtopic.runtime.task1;

public class LmvVehicle extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("LmvVehicle :: getSpec()");
	}
	public void getLmvInfo() 
	{
		System.out.println("LmvVehicle :: getLmvInfo()");
	}
}
