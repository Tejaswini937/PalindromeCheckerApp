import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class UC6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);      // Enqueue
            stack.push(ch);     // Push
        }

        boolean isPalindrome = true;

        // Compare queue dequeue with stack pop
        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}