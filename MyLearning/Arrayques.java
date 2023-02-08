package MyLearning;
import java.util.Scanner;

public class Arrayques {
    public static void main(String[] args) {

            //     question 1

     /*  float [] arr = {23.4f, 43.6f, 34.5f, 23.78f, 76.23f};
          float sum =0;
              for(int i=0; i<arr.length; i++){
                  sum += arr[i];
              }
         System.out.println(sum);  */


             //     question 2

     /*   int [] arr = {23, 43, 34, 23, 76};
          int find = 76;
          boolean isthere = false;
              for(int i=0; i< arr.length; i++){
                  if(arr[i] == find)
                      isthere = true;
              }
              if(isthere)
        System.out.println("the number is presrnt");
              else
                  System.out.println("the number is not there");*/


             //    question  3    (calculating average marks)

    /*    int [] arr = {23, 43, 34, 23, 76};
          int sum =0;
         int average;
              for(int i=0; i<arr.length; i++){
                  sum += arr[i];
              }
              average = sum/ arr.length;
         System.out.println(average);     */


           //      question  4    (addition of two matrices)

      /*     int [][] arr = {{1,5,3} , {7,5,6}};
           int [][] arr1 = {{3,2,1}, {6,4,3}};
           int [][] res  =  {{0,0,0}, {0,0,0}};

           for(int i=0; i<arr.length; i++){
               for (int j=0; j<arr[i].length; j++){
                   res[i][j] = arr[i][j] + arr1[i][j];
                   System.out.print( res[i][j] + ", ");
               }
               System.out.println();
           }
//        System.out.println(res[i][j]);   */


        //       question  5     (reverse an array)

     /*   int [] arr = {23, 43, 34, 23, 76};
          int temp;
          int n =Math.floorDiv(arr.length, 2);
            for(int i=0; i<n; i++){
                temp = arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
        System.out.println(arr);                   //   why this is not printing the reverse array
           for(int j=0; j< arr.length; j++){
               System.out.println(arr[j]); }  */


        //        queston  6     (finding maximum element in an array)

      /*   int [] arr =  {23, 43, 34, 106, 23, 76};
           int maxarr = arr[0];
           int n = arr.length;
           int i=1;
              while(i<n){
                  if(arr[i]>maxarr)
                      maxarr=arr[i];
                  i+=1;

              }
        System.out.println(maxarr);       */


        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


        }
    }



