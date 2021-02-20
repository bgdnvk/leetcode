class Solution {
    public int findNumbers(int[] nums) {

        int evens = 0;
        for (int i: nums){
            int length = String.valueOf(i).length();
            evens = length % 2 == 0 ? evens+1: evens;
        }
        return evens;
    }
}