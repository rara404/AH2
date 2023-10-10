// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Solution {
    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(31));

    }

    public static boolean isPrime(int x) {
        if (x <= 1) return false;

        for (int i = 2; i < x - 1; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }
}