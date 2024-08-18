package oops.abstopic.interfacetopic;

public	class HmvVehicle implements Vehicle
{
	public void getHmvInfo() 
	{
		System.out.println("HmvVehicle :: getHmvInfo()");
	}

	@Override
	public void getSpec() 
	{
		System.out.println("HmvVehicle : getSpec() ");
	}
}
