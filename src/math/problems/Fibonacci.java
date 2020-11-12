package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int a=0;
        int b=1;
        int c=a+b;

        for (int i=1;i<=40 ;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;

        }
    }
}
