import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number :: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isArmstrongNumber(input)) {
            System.out.println("Given Number is an Armstrong Number");
        }else{
            System.out.println("Given Number is Not an Armstrong Number");
        }
    }

    public static boolean isArmstrongNumber(int input) {
        int inputCopy = input;
        boolean result = false;
        int numberOfDigits = CountDigits.countDigits(input);
        double sum =0;
        while(input != 0){
            int lastNum = input %10;
            sum = sum + ( Math.pow(lastNum,numberOfDigits));
            input /=10;
        }
        if(sum == inputCopy){
            return true;
        }
        return result;
    }
}
