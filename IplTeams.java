public class IplTeams
{
	
 public static void team(String state)
 {
	 System.out.println("invoked team");
	 System.out.println("arg thing: "+state);
 }
 public static void team(String state,String topTeam)
 {
	    System.out.println("invoked breed with two parameters");
		System.out.println("String and String");
		System.out.println("arg1 state"+state);
		System.out.println("arg2 topTeam"+topTeam);
 }
 public static void team(String team,int position)
 {
	    System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 team"+team);
		System.out.println("arg2 position"+position);
 }
 public static void team(int price,String team)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("float and String");
		System.out.println("arg1 price"+price);
		System.out.println("arg2 team"+team);
		
	}
	
}