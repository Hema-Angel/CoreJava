package arrayLinkedLists;
import java.util.ArrayList;
public class RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Naveen");
        str.add("Hema");
        str.add("Surendra");
        str.add("Ramadevi");
        System.out.println(str);
        str.remove(str.size()-1);
        System.out.println(str);
        
    }
}
