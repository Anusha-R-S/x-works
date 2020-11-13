package xworkz.bus;

public class BusTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm kareyuvudu main");

		System.out.println("Total stops to search" + BusStops.totalstops());
		BusStops.search("Haveri");

		System.out.println("main nirgamana");
	}

}
