public class DogBreedsTester{


public static void main(String[] somethings)
{
	System.out.println("JVM invoked main");	
		
        
		DogBreeds.breed("German");

		DogBreeds.breed("rot","lab");
		
		DogBreeds.breed("pitbull",14);
		
		DogBreeds.breed(66,"Beagle");


	System.out.println("EXIT :: main");	
}

}