package streamsprogramming;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddSquares {
    //Given an array of Integers, write a program to find the average of squares of all the odd numbers.
        public static void main(String[] args) {
            int[] num= {2,3,5, 6, 8, 9};
            IntStream s = Arrays.stream(num);
            System.out.println(s.filter(n -> n % 2 != 0) // Filter odd numbers
                    .mapToDouble(n -> n * n) // Square each odd number
                    .average().getAsDouble()); // Calculate average
        }

    }
