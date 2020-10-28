public class Conversion
{
 public static void main(String[] args)
 {
	 System.out.println("The Program will convert string to number");
	 
	 String RNum="120";
	 byte convertedRoomNum=Byte.parseByte(RNum);
	 System.out.println("converted byte : "+convertedRoomNum);
	 
	 String sal="25000";
	 short convertedSalary=Short.parseShort(sal);
	 System.out.println("converted short: "+convertedSalary);
	 
	 String star="30000";
	 int convertedStars=Integer.parseInt(star);
	 System.out.println("converted int: "+convertedStars);
	 
	 String pop="25698425856";
	 long convertedPopulation=Long.parseLong(pop);
	 System.out.println("converted long: "+convertedPopulation);
	 
	 String height="5.0";
	 float convertedHeight=Float.parseFloat(height);
	 System.out.println("converted float: "+convertedHeight);
	 
	 String weight="5.9721087465876597";
	 double convertedWeightOfEarth=Double.parseDouble(weight);
	 System.out.println("converted double: "+convertedWeightOfEarth);
	 
	 String sugar="true";
	 boolean convertedSugar=Boolean.parseBoolean(sugar);
	 System.out.println("converted boolean: "+convertedSugar);
	 
	 //String grade="A";
	 //char convertedGrade=Character.parseCharacter(grade);
	 //System.out.println("converted char: "+convertedGrade);
 }
}