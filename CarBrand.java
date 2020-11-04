public class CarBrand
{
   public static String[] getBrands()
	{
		String[] cars={"Rolls Royse","BMW","Lambargini","Bolero","ReadyGo","Baleno","Hundai","Audi","Benz","Jaguar"};
		
		System.out.println("cars size"+cars.length);
		
		for(int count=0;count<cars.length;count++)
		{
			System.out.println("count "+count);
			String car=cars[count];
			System.out.println("Car Brands "+ car);
		}
		return cars;
	}

}