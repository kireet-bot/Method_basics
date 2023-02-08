package Leetcode;

import java.util.Scanner;

public class Salary_Average {
    public static double average(double[] salary) {
        double max = 0;
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        double average =0;

        for(int i=0; i<salary.length; i++){
            if(salary[i]>max){
                max=salary[i];
            }
            else if(salary[i]<min){
                min = salary[i];
            }

            sum=sum+salary[i];
        }
        average=(sum-(max+min))/(salary.length-2);

        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("give the length of the array");
             int length = sc.nextInt();

        double [] mysalary = new double[length];
           System.out.println("give array elments :");
              for(int i=0; i< length; i++){
                mysalary[i]= sc.nextInt();
              }

        Salary_Average sal = new Salary_Average();
        System.out.println(sal.average(mysalary));

    }
}
