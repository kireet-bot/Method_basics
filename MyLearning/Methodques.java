package MyLearning;
import java.util.Scanner;
public class Methodques {

    //       Question 1            (printing a table)

   /*  static void table(int n){
            for(int i=0; i<=10; i++) {
                System.out.println(n +" X " + i + " =" + n*i);
            }
    } */


     //       question 2            (printing a pattern)

   /*   static void my_pattern(int i){
             for( i=1; i<10; i++){
                  for(int j=0; j<i; j++){
                    System.out.print("*");
                  }
               System.out.println();

             }
        } */

     //       question 3             (printing the sum of n numbers)

    /*    static int the_sum(int n){
             int  sum=0;
             for(int i=1; i<=n; i++){
                 sum += i;
                 System.out.println(sum);
             }
             return sum;
         }  */

     //       question 4

       static int fibonacci(int n){
           if(n==1)
               return 0;
           else if (n==2) {
               return 1;
           } else n= fibonacci(n-1) + fibonacci(n-2);
           return n;
       }

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int  a = sc.nextInt();
        table(a);   */

        //   mypattern(6);           ques 2

      /*  int x= the_sum(8);         ques 3
        System.out.println(x); */

      /*    int y =fibonacci(8);     ques 4
         System.out.println(y); */


    }

}
