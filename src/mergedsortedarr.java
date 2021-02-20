import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0; i < nums1.length; i++){

            if(nums1[i] == 0 && n > 0){
                System.out.println("n is "+n);
                nums1[i] = nums2[n-1];
                n--;
            }
        }
        Arrays.sort(nums1);
    }
}