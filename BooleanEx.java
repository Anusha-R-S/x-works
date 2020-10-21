public class BooleanEx
{
public static void main(String[] args)
{
System.out.println("BooleanEx: ");
arrayOfSugar();
}
public static void arrayOfSugar()
{
System.out.println("invoking arrayOfSugar");
boolean sugarIsSweet=true;
boolean sugarIsSpicy=false;

boolean[] s={sugarIsSweet,sugarIsSpicy};

boolean elementAtIndex0=s[0];
System.out.println("Sugar is sweet "+elementAtIndex0);

boolean elementAtIndex1=s[1];
System.out.println("sugar Is Spicy "+elementAtIndex1);

}
}