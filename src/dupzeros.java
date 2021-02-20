class Solution {

    public int[] shiftRight(int[] arr, int pos){
        // System.out.println("inside shift");
        // System.out.println("arr is "+Arrays.toString(arr));
        // System.out.println("pos is "+pos);
        for (int i = arr.length-1; i > pos; i--){
            // System.out.println("--inside loop--");
            // System.out.println("i is "+i);
            arr[i] = arr[i-1];
        }
        return arr;
    }

    public void duplicateZeros(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr = shiftRight(arr, i);
                i++;
            }
        }
    }
}