package DSA.Array;
import java.util.*;

public class A1 {
    public void main1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
        }

        if (n < 2) {
            System.out.println("Array must have at least two elements");

        }

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > fmax) {
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax && arr[i] != fmax) {
                smax = arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("No second maximum value found (all elements are same?)");
        } else {
            System.out.println("Second Maximum: " + smax);
        }

    }

    public static void main(String[] args) {
        A1 a = new A1();
        a.main1();
    }
}
