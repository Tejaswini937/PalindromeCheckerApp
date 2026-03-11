import java.util.Scanner;

public class UC8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();

        char[] list = s.toCharArray();

        int i = 0;
        int j = list.length - 1;

        boolean palindrome = true;

        while (i < j) {
            if (list[i] != list[j]) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}