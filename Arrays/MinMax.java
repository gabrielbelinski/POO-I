public class MinMax {
    public static void main (String[] args) {
        int[] nums = { 99, -10, 100, 19, 977, -562, 463, -9, 287, 49 };
        int min, max;
        min = max = nums[0];
        /* for(int i=1; i < 10; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        } */

        for(int j: nums){
            if(j < min)
                min = j;
            if(j > max){
                max = j;
            }
        }
        System.out.println("Min e Max: " + min + " " + max);
    }
}
