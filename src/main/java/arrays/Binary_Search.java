package arrays;
import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        System.out.println("enter the number to be searched:");
         Scanner sc= new Scanner(System.in);
         int tar= sc.nextInt();
        binarySearch(arr,tar);
    }
    public static void binarySearch(int arr[], int tar) {
        int start = 0, end = arr.length - 1, count = 0;
        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end) / 2;
            if (arr[mid] == tar) {
                count++;
            }
            if (tar < arr[mid]) {
                end = mid - 1;
            }
            if (tar > arr[mid]) {
                start = mid + 1;
            }
        }
        if(count ==0)
            System.out.println("Sorry! Number not found");
        else
            System.out.println("Number is found");
    }
}
