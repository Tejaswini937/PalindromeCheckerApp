import java.util.Scanner;

class PalindromeChecker {

    boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

public class UC11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker();

        if (pc.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}