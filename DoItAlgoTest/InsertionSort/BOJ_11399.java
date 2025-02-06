package DoItAlgoTest.InsertionSort;

import java.util.*;

public class BOJ_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // 삽입정렬
        for (int i = 1; i < n; i++) {
            int insertIndex = i;
            int insertValue = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] < A[i]) {
                    insertIndex = j + 1;
                    break;
                }
                if (j == 0) {
                    insertIndex = 0;
                }
            }
            for (int j = i; j > insertIndex; j--) {
                A[j] = A[j - 1];
            }
            A[insertIndex] = insertValue;
        }


        S[0] = A[0];
        for (int i = 1; i < n; i++) {
            S[i] = S[i - 1] + A[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += S[i];
        }
        System.out.println(sum);

    }
}
