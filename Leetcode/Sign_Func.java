package Leetcode;

// 1822. Sign of the Product of an Array

public class Sign_Func {
    public int arraySign(int[] nums) {
        int count = 0, sign=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){return sign;};
            if(nums[i]<0){
                count++;
            }
        }
        if(count%2!=0){
            sign = -1;
        }
        else{
            sign = 1;
        }
        return sign;
    }

}
