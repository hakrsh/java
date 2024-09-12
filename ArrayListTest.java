import java.util.ArrayList;;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hari");
        names.add("nami");
        for(String name:names)
            System.out.println(name);
        for(int i=0;i<names.size();i++)
            System.out.println(names.get(i));
        names.remove(0);
    }
}
