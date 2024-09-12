import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            String fileName = "test";
            readFile(fileName);
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
        try {
            String fileName = "MathTest.java";
            readFile(fileName);
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void readFile(String fileName) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = r.readLine()) != null) {
            System.out.println(line);
        }
        r.close();
    }
}
