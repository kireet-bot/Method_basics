
//   count of odd numbers between low and high (inclusive)

package Leetcode;
 class Solution {
        public static int countOdds(int low, int high) {
            int count =0;
            for(int i=low; i<=high; i++){
                if(i%2!=0){
                    count++;}
            }
            return count;
        }

         public static void main(String[] args){
             System.out.println(countOdds(7,13));
        }


}