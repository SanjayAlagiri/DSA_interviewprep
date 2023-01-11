package strings;

public class duplicates {
    static final int NO_OF_CHAR = 256;

    static void fillCharCount(String input , int[] count){
        for (int i = 0 ; i < input.length() ; i++){
            count[input.charAt(i)]++;
        }
    }
    static void printDuplicates(String input){
        int[] count = new int[NO_OF_CHAR];
        fillCharCount(input , count);
        for (int i = 0 ; i < NO_OF_CHAR ; i++){
            if (count[i] > 1){
                System.out.println( (char)(i)  + " the count is " + count[i]);
            }
        }

    }
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        printDuplicates(input);
    }
}
