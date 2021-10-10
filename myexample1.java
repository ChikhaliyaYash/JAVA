public class myexample1
{
    public int i;
    protected int j;
}
class Derived extends myexample1
{
    int j;
    void message()
    {
        super.j = 10;
        System.out.println(i + " " + super.j);
    }
}

class UnitTest
{
    public static void main(String a[])
    {
        Derived d = new Derived();
        d.i = 6;
        d.j = 3;
        d.message();
    }
}
