enum Dogs
{
     GERMANSHEPHERD,ROTWEILER,PITBULL,BULLDOG,LABRADOR,CORGI,PUG
        
}

public class DogTester{

public static void main(String[] types)
{
	Dogs[] allDogs=Dogs.values();
	System.out.println(allDogs.length);
	for(int initial=0;initial<allDogs.length;initial++){
		System.out.println("index " + initial);
		Dogs dogs=allDogs[initial];
		System.out.println("Dogs enum Value " + dogs);
		
	}
}

}