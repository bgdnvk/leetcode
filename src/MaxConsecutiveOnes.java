import java.util.function.Function;
import java.util.ArrayList;
import java.util.Collections;

// interface CountInterface {
//     public int count(int[] arr);
// }

class Solution {

    // public static int updateArr(ArrayList arr, int temp){
    //         arr.add(temp);
    //         temp = 0;
    //         System.out.println("inside update "+arr);
    //         return temp;
    //     }

    public int findMaxConsecutiveOnes(int[] nums) {

        //--works but doesnt?
        /*
        CountInterface countThis = (arr) -> {
            int temp = 0;
            ArrayList arrCount = new ArrayList();
            for(int i: arr){
                //i == 1? temp++: arrCount.add(temp), temp=0;
                //temp = i == 1? temp+=1: updateArr(arrCount, temp);
                
                 if(i == 1){
                    temp++;
                  } else{
                     temp = updateArr(arrCount, temp);
                 }   
            }
            System.out.println("finished "+arrCount);
            
            return (Integer)Collections.max(arrCount);
        };
        
        
        return countThis.count(nums);
        /*
        //------?????
        
                /*
        Function<Integer, Integer> func = x -> x * 2;

        //Integer result = func.apply(2);
        Integer result = func.apply(2);

        System.out.println(result);         // 4
        */
        //return 0;
        /*
        IntStream intStream = Arrays.stream(nums);
        for (int i: nums){
            System.out.println(i);
        }
        */

        //System.out.println(cont1.cont(1,2));

        //cont1.cont(maxCont, storeMax);
        //System.out.println("after mod "+storeMax);
        
        /*
        Consumer<Integer> changeMax = (Integer maxCont, Integer storeMax) -> {
            storeMax = maxCont;
            maxCont = 0;
        };
        */
        //IntStream intStream = Arrays.stream(nums);
        //intStream1.forEach(x -> System.out.println(x));
        //int res = intStream.filter(e -> e == 1 );
        //intStream.filter(e -> e==1).forEach(System.out::println);



        //System.out.println("res is "+res);

        // ArrayList arrCount = new ArrayList();
        // int temp = 0;
        // for(int i: nums){
        //     if(i == 1){
        //         //System.out.println(i);
        //         //System.out::println;
        //         temp++;
        //     } else{
        //         arrCount.add(temp);
        //         temp = 0;
        //     }
        // }
        // return (Integer)Collections.max(arrCount);

        //i == 1 ? maxCont++ : changeMax(maxCont, storeMax);
        //return maxCont;
        //System.out.println(arrCount);
        //System.out.println(Collections.max(arrCount));

        int max = 0;
        int current = 0;
        for (int i : nums) {
            if (i == 1) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                if (max >= nums.length / 2) {
                    return max;
                }
                current = 0;
            }
        }
        return Math.max(max, current);


    }
}