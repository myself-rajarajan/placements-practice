public class ClosestToZero {
    public static void main(String[] args){
        int[] nums = {-4, -2, 1, 4, 8};
        int n = nums.length;
        int close = nums[0];

        for(int i = 0; i < n; i++){
            if(Math.abs(nums[i]) < Math.abs(close)){
                close = nums[i];
            }
            else if(close < 0 && Math.abs(close) == nums[i]){
                close = nums[i];
            }
        }
        System.out.println("number near to 0 is: " + close);
    }
}