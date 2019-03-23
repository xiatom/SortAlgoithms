package Sort;
import java.util.Scanner;

public class InsertSort {

	public static void insertion_sort(int a[], int n) {
		int i, j, temp;
		for (i = 1; i < n; i++) {
			for (j = i - 1, temp = a[i]; j >= 0 && temp < a[j]; j--) {
				a[i] = a[j];
				a[j] = temp;
				
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 7, 9, 8, 1, 2, 3 };
		insertion_sort(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + " ");
		}

	}

}
