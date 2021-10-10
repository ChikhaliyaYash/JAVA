package temp;
import java.util.Scanner;
public class ex1
{
    public static void main(String[] ar)
    {

        String s;

        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        for (int i=0;i<s.length();i++)

        {
            if(i%2==0)
            {
                System.out.print(s.charAt(i));
            }
        }

        System.out.print(" ");
        for(int i=0;i<s.length(); i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(s.charAt(1));
            }
        }
        System.out.println("\nID:-D21DCS149\tyash chikhaliya");
    }
}
