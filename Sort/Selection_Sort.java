package Sort;

/**
 * 项目名: Nowcoder 包名: Sort 文件名: Selection_Sort.java 创建时间: 2019年3月21日
 * 
 * @author: xiatom 描述: 选择排序
 * 
 *
 **/
public class Selection_Sort {

	public static void selection_Sort(int[] a, int n) {
		int index, i, j, temp;
		for (i = 0; i < n-1; i++) {
			for (index = i,j = i + 1;j < n; j++) {
				if(a[index]>a[j])
					index = j;
			}
			temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 7, 9, 8, 1, 2, 3 };
		selection_Sort(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
