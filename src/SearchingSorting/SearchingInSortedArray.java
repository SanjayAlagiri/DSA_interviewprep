package SearchingSorting;

public class SearchingInSortedArray {
    public static int search(int[] input , int k , int x ,int i){
        while (i < input.length) {
            if (input[i] == x) {
                return i;
            }
            i = i + Math.max(1, Math.abs((x - input[i]) / k));
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = 20, x = 60, i = 0;
        int[] input = {20, 40, 50, 70, 70, 60};
        int result = search(input , k , x , i);
        System.out.print(result);
    }
}
