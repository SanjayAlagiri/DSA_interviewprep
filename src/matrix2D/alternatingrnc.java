package matrix2D;

import java.util.Scanner;

public class alternatingrnc {

    public static void printmatrix(int n , int m){
        char[][] res = new  char[n][m];

        int r = n , c = m;
        int  k = 0; //  statring row index
        int  l = 0; // starting col index m = no of row n = no of col
        char x ='x';
        while ( k < n && l < m) {
            for (int i = l; i < m; i++)  // to fill the top row
                res[k][i] = x;
            k++;
            for (int i = k; i < n; i++)  // to fill the side col
                res[i][m - 1] = x;
            m--;
            if (k < n) {
                for (int i = m - 1; i >= l; --i) // last row
                    res[n - 1][i] = x;
                n--;
            }
            if (l < m) {
                for (int i = n - 1; i >= k; --i)
                    res[i][l] = x;
                l++;
            }
            x = (x == 'O') ? 'x' : 'O';
        }
            for (int i = 0 ; i < r ; i++){
                for (int j = 0 ; j < c ; j++){
                    System.out.print(res[i][j]);
                }
                System.out.println(" ");
            }

    }
    public static void main(String[] args) {
        int n , m;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        printmatrix(n , m);
    }
}
