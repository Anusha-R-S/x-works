public class AddressTester
{
	public static void main(String[] args)
	{
		System.out.println("Invoked main");
		
		int door=Address.doorNo;
		System.out.println("Door number :"+door);
		
		String City=Address.city;
		System.out.println("City is :"+City);
		
		String Street=Address.street;
		System.out.println("Street is :"+Street);
		
		int pincode=Address.pinCode;
		System.out.println("pincode is :"+pincode);
		
		System.out.println("Exit :: main");
	}
}