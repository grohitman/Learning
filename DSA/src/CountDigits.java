import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter a Number :: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print("Number of Digits in the given input:: " +  countDigits(input));
    }

    public static int countDigits(int input) {
        int count =0;
        while(input > 0){
            count++;
            input = input/10 ;
        }
        return count;
    }
}
