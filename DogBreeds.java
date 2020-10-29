public class DogBreeds
{
	
 public static void breed(String type)
 {
	 System.out.println("invoked breed");
	 System.out.println("arg thing: "+type);
 }
 public static void breed(String type,String types)
 {
	    System.out.println("invoked breed with two parameters");
		System.out.println("String and String");
		System.out.println("arg1 type"+type);
		System.out.println("arg2 types"+types);
 }
 public static void breed(String dog,int age)
 {
	    System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 something"+dog);
		System.out.println("arg2 noOfPlates"+age);
 }
 public static void breed(int height,String breedType)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("float and String");
		System.out.println("arg1 noOfPlates"+height);
		System.out.println("arg2 something"+breedType);
		
	}
	
}