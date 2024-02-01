package loops;

public class PatternPlusMinus {
    // Program for 5 rows and 6 columns
    public static void main(String args[]){
        int row= 5; int column = 6;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column-1-i; j++){
                System.out.print("+");
            }
            for(int j=column-i; j<=6; j++){
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
