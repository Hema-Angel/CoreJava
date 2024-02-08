package arrayLinkedLists;
import java.util.ArrayList;
import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("India");
        stringList.add("Japan");
        stringList.add("Russia");
        stringList.add("China");

        // Convert ArrayList to an array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Print the elements in the array
        System.out.println("Elements in the Array:");
        for (String str : stringArray) {
            System.out.print(str+" ");
        }
    }
}

