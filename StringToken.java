import java.util.StringTokenizer;;
public class StringToken {
    public static void main(String[] args) {
        String str = "1,2,3";
        StringTokenizer tokenizer = new StringTokenizer(str,",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
