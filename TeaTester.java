 enum Teas
{
     GREENTEA,HERBALTEA,DANDELIONTEA,MASALATEA,MATCHATEA,GINGERTEA
        
}


public class TeaTester{

public static void main(String[] types)
{
	Teas[] allTeas=Teas.values();
	System.out.println(allTeas.length);
	for(int initial=0;initial<allTeas.length;initial++){
		System.out.println("index " + initial);
		Teas tea=allTeas[initial];
		System.out.println("Teas enum Value " + tea);
		
	}
}

}