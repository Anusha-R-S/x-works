public class TeaTypesTester{


public static void main(String[] chai)
{
	System.out.println("JVM invoked main");	
		
        
		TeaTypes.tea("Green Tea");

		TeaTypes.tea("Herbal Tea","Masala Tea");
		
		TeaTypes.tea("Dandelion Tea",1);
		
		TeaTypes.tea(56565656,"Matcha Tea");


	System.out.println("EXIT :: main");	
}

}