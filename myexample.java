public class myexample
{
 public static int CBSC(int x)
 {
     if (x<100)
     {
         x=CBSC(x+10);
     }
     return x-1;
 }
 public static void main(String[] a){
     System.out.println(myexample.CBSC(1));

 }
}

