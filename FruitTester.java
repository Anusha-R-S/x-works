enum Fruit
{
APPLE,ORANGE,WATERMELON,BANANA,STRAWBERRY,GRAPES
}
public class FruitTester{

public static void main(String[] types)
{
	Fruit[] allFruit=Fruit.values();
	System.out.println(allFruit.length);
	for(int initial=0;initial<allFruit.length;initial++){
		System.out.println("index " + initial);
		Fruit fruit=allFruit[initial];
		System.out.println("Fruit enum Value " + fruit);
		
	}
}

}