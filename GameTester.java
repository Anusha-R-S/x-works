enum Game
{
SUBWAYSURFERS,LUDO,CANDYCRUSH,PUBG,CLASHOFCLANS,CHESS,CARROM
}


public class GameTester{

public static void main(String[] types)
{
	Game[] allGame=Game.values();
	System.out.println(allGame.length);
	for(int initial=0;initial<allGame.length;initial++){
		System.out.println("index " + initial);
		Game game=allGame[initial];
		System.out.println("Games enum Value " + game);
		
	}
}

}