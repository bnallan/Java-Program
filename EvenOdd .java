import java.util.scanner;

 public class EvenOdd
{
    public static void main(string args[])
     {
      system.out.print("Enter a number: ");
      scanner reader = new scanner(system.in); //Object creation
      int num = reader.nextInt();             //reading the interger number
      reader.close();
      if(num % 2== 0)
        {
            system.out.print("\nEnetred number " +num + " is an Even number.");
        }
       else
        {
           system.out.print("\nEnetred number " +num + " is an Odd number.");
        }
     }
}
