public class TeaTypes
{
	
 public static void tea(String type)
 {
	 System.out.println("invoked tea");
	 System.out.println("arg thing: "+type);
 }
 public static void tea(String state,String famousTea)
 {
	    System.out.println("invoked breed with two parameters");
		System.out.println("String and String");
		System.out.println("arg1 state"+state);
		System.out.println("arg2 famousTea"+famousTea);
 }
 public static void tea(String topTea,int price)
 {
	    System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 topTea"+topTea);
		System.out.println("arg2 price"+price);
 }
 public static void tea(int position,String state)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("float and String");
		System.out.println("arg1 position"+position);
		System.out.println("arg2 state"+state);
		
	}
	
}