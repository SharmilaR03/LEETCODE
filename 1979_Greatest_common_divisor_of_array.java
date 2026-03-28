class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int num:nums){
            if(num<min){
                min=num;
            }
            if(num>maxi){
                maxi=num;
            }
        }
        while(maxi!=0){
            int rem=min%maxi;
            min=maxi;
            maxi=rem;
        }
        return min;
    }
}
