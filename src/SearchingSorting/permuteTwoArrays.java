package SearchingSorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class permuteTwoArrays {
    public static boolean result(Integer[] A ,int[] B ,int k){
        Arrays.sort(A , Collections.reverseOrder());
        Arrays.sort(B);

        for (int i = 0 ; i < A.length ; i++){
            if (A[i] + B[i] < k)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] A = { 1, 2, 2, 1};
        int[] B = {3, 3, 3, 4 };
        int k = 5;

        boolean output = result( A, B , k);
        System.out.println(output);
    }
}
