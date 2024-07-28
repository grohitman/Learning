import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number :: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isPalindrome(input)) {
            System.out.println("Given Number is a Palindrome");
        }else{
            System.out.println("Given Number is Not a Palindrome");
        }
    }

    public static boolean isPalindrome(int input) {
        boolean result= false;
        if(input == ReverseNumber.reverseNumber(input)){
            return true;
        }
        return result;
    }
}
