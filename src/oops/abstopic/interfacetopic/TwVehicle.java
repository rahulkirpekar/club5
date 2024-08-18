package oops.abstopic.interfacetopic;

public class TwVehicle implements Vehicle
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
