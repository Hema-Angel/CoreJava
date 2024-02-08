package arrayLinkedLists;
import java.util.ArrayList;
public class Enhancedforloop {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Hema");
        str.add("Naveen");
        str.add("Surendra");
        str.add("Usha");
        forloop(str);
        enhancedforloop(str);
    }

    private static void enhancedforloop(ArrayList<String> str) {
        System.out.print("Retrieve using enhanced for loop: ");
        for(String s: str){
            System.out.print(s + " ");
        }
    }

    private static void forloop(ArrayList<String> str) {
        for(int i=0; i<str.size(); i++){
            System.out.print(str.get(i)+" ");
        }
        System.out.println("");
    }
}
