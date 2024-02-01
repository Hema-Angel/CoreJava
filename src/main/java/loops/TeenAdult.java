package loops;
import java.util.Scanner;
public class TeenAdult {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=13 && age<=19)
            System.out.println("The person is a teenager");
        else if(age<13)
            System.out.println("The person is a kid");
        else
            System.out.println("The person is an adult");
    }
}
