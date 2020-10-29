public class PlaceFinder
{
	public static void main(String[] place)
	{
		System.out.println("JVM invoked main");
		String placeDistanceInKm=place[0];
		int dis=Integer.parseInt(placeDistanceInKm);
		Place.placeName(dis);
		System.out.println("Exit::main");
		
	}
}