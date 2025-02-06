package DoItAlgoTest.SelectionSort;

import java.util.Scanner;

public class BOJ_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] Arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Arr[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if (Arr[j] > Arr[max]) {
                    max = j;
                }
            }
            if (Arr[i] < Arr[max]) {
                int temp = Arr[i];
                Arr[i] = Arr[max];
                Arr[max] = temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(Arr[i]);
        }
    }
}
