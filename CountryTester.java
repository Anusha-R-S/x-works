public class CountryTester
{
	public static void main(String[] args)
	{
		System.out.println("Invoked main");
		
		String Name=Country.name;
		System.out.println("Country name :"+Name);
		
		Name="America";
		System.out.println("Updated Country name :"+Name);
		
		byte States=Country.numOfStates;
		System.out.println("numOfStates :"+States);
		
		States=50;
		System.out.println("Updated numOfStates :"+States);
		
		String State=Country.state;
		System.out.println("State name :"+State);
		
		State="California";
		System.out.println("Updated State name :"+State);
		
		byte Dist=Country.numOfDist;
		System.out.println("Number of Districts :"+Dist);
		
		Dist=94;
		System.out.println("Updated numOfDist :"+Dist);
		
		short Tq=Country.numOfTalluk;
		System.out.println("numOfTalluk :"+Tq);
		
		Tq=120;
		System.out.println("Updated Talluks :"+Tq);				
		
		System.out.println("Exit :: main");
	}
}