package streamsprogramming;
import java.util.Arrays;
import java.util.stream.IntStream;
public class EvenNumberTwice {

    //Given a list of integers, filter out the even numbers and then double each remaining number using streams.
        public static void main(String args[]){
            int[] i1={2,32,79,90,117,54,61,88,10,44,97,62};
            IntStream v1= Arrays.stream(i1);
            v1.filter(s2 -> s2%2==1).map(s3 -> (s3*2)).forEach(s4 -> System.out.print(s4+" "));
           /* int[] num = {1, 2, 3, 4, 5, 7,8};
            IntStream s= Arrays.stream(num);
            System.out.println(s.filter(a -> a % 2 == 0)
                    .map(b -> b * 2)
                    .collect(Collectors.toList()));*/
        }
    }

