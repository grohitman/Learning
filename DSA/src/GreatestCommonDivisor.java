import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Enter a Number :: ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("Enter another Number :: ");
        int input2 = sc.nextInt();
        System.out.println("Greatest Common Divisor of the input numbers is :: " + findGCD(input1,input2));
    }

    public static int findGCD(int input1,int input2) {
        int result = 1;
        for (int i = 2; i < Math.min(input1,input2); i++) {
            if(input1 % i ==0 && input2 % i ==0){
                result = i;
            }
        }
        return result;
    }
}
