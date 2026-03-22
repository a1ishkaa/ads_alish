import java.util.Scanner;

public class Main {

    // Task 1: Print digits
    static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2: Sum (для average)
    static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    // Task 3: Prime check
    static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Task 4: Factorial
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Task 5: Fibonacci
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // Task 6: Power
    static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7: Reverse input
    static void reverse(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reverse(n - 1, sc);
        System.out.print(x + " ");
    }

    // Task 8: Only digits
    static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }

    // Task 9: Count chars
    static int count(String s) {
        if (s.equals("")) return 0;
        return 1 + count(s.substring(1));
    }

    // Task 10: GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printDigits(5481);

        int[] arr = {3,2,4,1};
        int s = sum(arr, arr.length);
        System.out.println("Average: " + (double)s / arr.length);

        System.out.println(isPrime(7, 2));

        System.out.println(factorial(5));

        System.out.println(fib(5));

        System.out.println(power(2, 10));

        reverse(4, sc);

        System.out.println(isDigits("12345", 0));

        System.out.println(count("hello"));

        System.out.println(gcd(32, 48));
    }
}