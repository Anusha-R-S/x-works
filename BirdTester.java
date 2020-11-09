enum Birds
{
 PARROT,PIGEON,CROW,PEACOCK,SPARROW,DOVE,OSTRICH
}

public class BirdTester{

public static void main(String[] types)
{
	Birds[] allBirds=Birds.values();
	System.out.println(allBirds.length);
	for(int initial=0;initial<allBirds.length;initial++){
		System.out.println("index " + initial);
		Birds bird=allBirds[initial];
		System.out.println("Birds enum Value " + bird);
		
	}
}

}