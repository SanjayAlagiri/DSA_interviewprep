package SearchingSorting;

public class countingSort {
    static char countingSort(char[] input , int n){
        int[] output = new int[n];

        int[] count = new int[9];


        for (int i = 0 ; i < n ; i++){
            count[input[i]]++;
        }
        for ( int i = 1 ; i < n ; i++){
            count[i] += count[i-1];
        }
        for (int i = n - 1 ; i >= 0  ; i--){
            output[count[input[i]] - 1] = input[i];
            --count[input[i]];
        }

        for (int i = 0 ; i < n ; i++){
            System.out.println(output[i]);
        }

     return 0;
    }
    static void countingSortaplhabets(char[] input1 , int n1){
        char[] output  = new char[n1];
        int[] count = new int[256];

        for (int i = 0 ; i < n1 ; i++){
            count[input1[i] - 'a']++;
        }
        for (int i = 1 ; i < 256 ; i++){
            count[i] += count[i-1];
        }
        for (int i = n1 - 1 ; i >=0 ; i--){
            int x = --count[input1[i] - 'a'];
            output[x] = input1[i];
        }
        for (int i = 0 ; i < n1 ; i++){
            System.out.println(output[i]);
        }
    }
    public static void main(String[] args) {
        char[] input = {1, 4, 8, 1, 7, 2, 6, 5, 2 };
        int n = input.length;
        countingSort(input , n);
        char[] input1 =  { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
        int n1 = input1.length;
        countingSortaplhabets( input1 , n1);
    }
}
