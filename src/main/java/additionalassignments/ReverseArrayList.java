package additionalassignments;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
//        list.add(3);
//        list.add(5);
//        list.add(7);
//        list.add(10);
//        list.add(14);
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
