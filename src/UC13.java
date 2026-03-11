import java.util.Scanner;

public class UC13 {

    static boolean method1(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return s.equals(rev);
    }

    static boolean method2(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean r1 = method1(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = method2(input);
        long end2 = System.nanoTime();

        System.out.println("Method1 result: " + r1 + " Time: " + (end1 - start1));
        System.out.println("Method2 result: " + r2 + " Time: " + (end2 - start2));
    }
}