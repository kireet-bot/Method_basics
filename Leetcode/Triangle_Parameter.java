package Leetcode;
//  return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths

public class Triangle_Parameter {
    public static int largestPerimeter(int[] nums) {
         int temp;
        int perimeter=0;

        for(int j=0; j<nums.length; j++){
             for(int l=j+1; l<nums.length; l++) {
                 if (nums[j] < nums[l])
                 {
                     temp = nums[j];
                     nums[j] = nums[l];
                     nums[l] = temp;
                 }
             }
         }

         int i=0;
        int s1 =nums[0];
        int s2 = nums[1];
        int s3 = nums[2];

     while(i<nums.length-2){
          if(nums[i]<(nums[i+1]+nums[i+2])){
              s1 = nums[i];
              s2 = nums[i+1];
              s3 = nums[i+2];
              perimeter =s1+s2+s3;
              return perimeter;
          }
          i++;
          System.out.println(s1+" "+s2+" "+s3);
      }

        return perimeter;
    }

    public static void main(String[] args) {
        int [] LargestNums = {3,2,3,4};
   //     largestPerimeter(LargestNums);
        System.out.println(largestPerimeter(LargestNums));
    }
}
