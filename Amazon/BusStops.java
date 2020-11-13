package xworkz.bus;

public class BusStops {
	private static String[] stops = { "Hubballi", "Yalugi", "Gadag", "Haveri", "Davanagere", "Harihara", "Shivamogga",
			"Bangalore" };

	public static void search(String product) {
		System.out.println("search kareyuvudu");
		System.out.println("Total stops available" + stops.length);
		System.out.println("arg1 :" + product);
		boolean stopFound = false;
		for (int count = 0; count < stops.length; count++) {
			// System.out.println("item at position " + items[count]);
			String item = stops[count];
			if (item.equals(product)) {
				// System.out.println("item is found");
				stopFound = true;
				break;
			} else {
				// System.out.println("item is not found");
				stopFound = false;
			}

		}

		if (stopFound) {
			System.out.println("stop is found ");
		} else {
			System.out.println("stop is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalstops() {
		return stops.length;
	}

}
