import java.util.HashMap;;
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 2);
        map.putIfAbsent(1, 3);
        System.out.println(map);
    }
}
