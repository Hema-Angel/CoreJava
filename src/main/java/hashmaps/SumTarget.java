package hashmaps;
import java.util.HashMap;
public class SumTarget {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] a1 = {10, 20, 30, 40, 50, 60};
        int n1 = -1;
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] + a1[j] == 100) {
                    map1.put(n1++, i);
                    map1.put(n1++, j);
                }
            }
        }
        System.out.println(map1.values());
    }
}

