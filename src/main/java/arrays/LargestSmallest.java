package arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 24, 6, -4};
        largest(arr);
        smallest(arr);
    }
    public static void largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
            }
        System.out.println("Maximum Value is:" + max);
    }
    public static void smallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Minimum Value is:" + min);
    }
    }
