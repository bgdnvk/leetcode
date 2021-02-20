import java.util.Arrays;

interface SquareStoreArr {
    public int[] squareStore(int[] arr);
}

class Solution {
    public int[] sortedSquares(int[] nums) {

//         int[] squaredArr = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             squaredArr[i] = nums[i] * nums[i];
//         }

//         System.out.println(squaredArr);
//         Arrays.sort(squaredArr);
//         return squaredArr;


        SquareStoreArr ss = (arr) -> {
            int[] squaredArr = new int[nums.length];
            for(int i = 0; i < arr.length; i++){
                squaredArr[i] = arr[i] * arr[i];
            }
            Arrays.sort(squaredArr);
            return squaredArr;
        };

        return ss.squareStore(nums);

    }
}