package arrays;

public class Reversearray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10};
        reversearray(arr);
        printarr(arr);
    }

    public static void reversearray(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = 0;
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


