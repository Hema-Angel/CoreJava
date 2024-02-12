package streamsprogramming;
import java.util.Arrays;
import java.util.List;

public class SquareOfPositiveNums_7 {
    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, -5, 6, -7, 8, 9, 10);

            long sumOfSquares = numbers.stream()
                    .filter(n -> n > 0)
                    .mapToLong(n -> n * n)
                    .sum();

            System.out.println("Sum of squares of positive integers: " + sumOfSquares);
        }
    }
