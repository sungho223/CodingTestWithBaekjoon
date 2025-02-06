package DoItAlgoTest.BubbleSort;

import java.util.Scanner;

class BOJ_2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Arr = new int[n];

        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        // 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]);
        }
    }
}