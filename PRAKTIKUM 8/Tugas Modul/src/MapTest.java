import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        map.put(4, "empat");
//        System.out.println(map.get(1));
        Set<Integer> key=map.keySet();
        for (Integer k : key) {
            System.out.println(map.get(k));
        }
    }
}