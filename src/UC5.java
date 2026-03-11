import java.util.Stack;

public class UC5 {
    public static void main(String[] args) {
        String str = "deed";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}