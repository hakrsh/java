import java.io.*;;
public class Input {
    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("How old are you: ");
            String input = console.readLine();
            System.out.println(Integer.parseInt(input));   
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
