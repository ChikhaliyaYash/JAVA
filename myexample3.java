import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class myexample3
{
    public static void main(String[] args)throws Exception
    {
    File f= File.createTempFile("Teap",".txt");
    FileReader fr=new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    int i= 0;
    int count = 0;
    while ((i =br.read())!=-1)
    {
        if (i == args[0].charAt(0))
            count++;
    }
        System.out.println("The given letter: " +args[0].charAt(0) + " occurs" + count + "times!!");
        fr.close();
    }
}


