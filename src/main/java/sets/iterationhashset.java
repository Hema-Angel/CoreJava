package sets;
import java.util.HashSet;
import java.util.Iterator;

public class iterationhashset{
        public static void main(String[] args) {
            // Create HashSet
            HashSet<String> stringHashSet = new HashSet<>();

            // Add 10 strings to the HashSet
            stringHashSet.add("One");
            stringHashSet.add("Two");
            stringHashSet.add("Three");
            stringHashSet.add("Four");
            stringHashSet.add("Five");
            stringHashSet.add("Six");
            stringHashSet.add("Seven");
            stringHashSet.add("Eight");
            stringHashSet.add("Nine");
            stringHashSet.add("Ten");

            // Iterate using Iterator
            System.out.println("Iterating using Iterator:");
            Iterator<String> iterator = stringHashSet.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            // Iterate using for loop
            System.out.println("\nIterating using for loop:");
            Object[] stringArray = stringHashSet.toArray();
            for (int i = 0; i < stringArray.length; i++) {
                String element = (String) stringArray[i];
                System.out.println(element);
            }

            // Iterate using enhanced for loop
            System.out.println("\nIterating using enhanced for loop:");
            for (String element : stringHashSet) {
                System.out.println(element);
            }
        }
    }
