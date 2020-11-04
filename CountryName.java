public class CountryName{



   public static void main(String[] names)
   {
	   
	   System.out.println("JVM invoked main");
	   
	   System.out.println("Country Names");
	
	   for(int country=0;country<names.length;country++)
	   {
		   System.out.println("looping number"+country);
		   String mainMethodArg=names[country];
		   System.out.println("mainMethodArg "+mainMethodArg);
	   }
	   
	   
	   System.out.println("EXIT  :: main");
	   
   }

}
