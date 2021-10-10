import java.io.*;
public class myexample5
{
    public static void main(String[] args) {
            try {
                File file = new File("D:\\p1\\p1.txt");
                FileReader fileReader = new FileReader(file); // A stream that connects to the text file
                BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the BufferedReader

                String line;
                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line); // Display the file's contents on the screen, one line at a time
                }

                bufferedReader.close(); // Close the stream
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

