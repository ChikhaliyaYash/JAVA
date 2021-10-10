public class myexample6
{


    public static class myexample1  implements Runnable
    {


        public static void main(String[] args)
        {
            Thread guruThread1 = new Thread("Guru1");
            Thread guruThread2 = new Thread("Guru2");
            guruThread1.start();
            guruThread2.start();
            System.out.println("Thread names are following:");
            System.out.println(guruThread1.getName());
            System.out.println(guruThread2.getName());
        }
        @Override
        public void run()
        {
         System.out.println("D21DCS149: YASH CHIKHALIYA");
        }

    }
}
