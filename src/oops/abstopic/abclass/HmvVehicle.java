package oops.abstopic.abclass;

public	class HmvVehicle extends Vehicle
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
