package math.problems;

public class Factorial {
    public static int factorial (int n){
        if (n==0) return n=1;
        return n*factorial((n-1));

    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 1;
        for (int i = 1; i < 6; i++) {
            num = num * i;
        }
        System.out.println( num);
        System.out.println("using Recursion method ");
        System.out.println(factorial(5));

    }
}
