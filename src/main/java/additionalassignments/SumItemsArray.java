package additionalassignments;

public class SumItemsArray {
    public static void main(String args[]){
        int item[] = {4, 6, 8, 10, 12};
        sumitem(item);
    }
    public static void sumitem(int item[]){
        int sum =0;
        for(int i=0; i<item.length; i++){
            sum = sum+item[i];
        }
        System.out.println("Total sum of array items is:"+ sum);
    }
}
