public class IplTeamsTester{


public static void main(String[] ipl)
{
	System.out.println("JVM invoked main");	
		
        
		IplTeams.team("RCB");

		IplTeams.team("RCB","RR");
		
		IplTeams.team("RCB",1);
		
		IplTeams.team(56565656,"RCB");


	System.out.println("EXIT :: main");	
}

}