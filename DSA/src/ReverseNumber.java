import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number :: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print("Reverse of the given input:: " +  reverseNumber(input));
    }

    public static int reverseNumber(int input) {
        int result=0;
        while(input != 0){
            int lastNum = input %10;
            result = (result*10) + lastNum;
            input /= 10;
        }
        return result;
    }
}
