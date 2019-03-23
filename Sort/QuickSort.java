package Sort;

/**
 * 项目名: Nowcoder 包名: Sort 文件名: QuickSort.java 创建时间: 2019年3月21日
 * 
 * @author: xiatom 描述: 快速排序
 * 
 *
 **/
public class QuickSort {
	
	public static void swich(int[] a,int l,int r){
		int temp = a[l];
		a[l] = a[r];
		a[r]= temp; 
	}

	public static int Partition(int[] a, int l, int r) {
		int leftPoint = l;
		int cur = a[l];//分割点
		int rightPoint =r+1;//
//		while(true){
//			while(a[++leftPoint]<=cur && leftPoint<r);
//			while(a[--rightPoint]>=cur && l<rightPoint);
//			if(leftPoint >= rightPoint)
//				break;
//			swich(a,leftPoint,rightPoint);
//		}
		
		while(true){
			while(a[++leftPoint]<cur && leftPoint<r);
			while(a[--rightPoint]>cur );//右边条件冗余，因为a[right]不可能越界
			if(leftPoint >= rightPoint)
				break;
			swich(a,leftPoint,rightPoint);
		}
		
		
		
		swich(a,l,rightPoint);
		return rightPoint;
	}

	public static void sort(int[] a, int l, int r) {
		if (l >= r)
			return;
		int j = Partition(a, l, r);
		sort(a, l, j-1);
		sort(a, j+1, r);

	}

	public static void main(String[] args) {

		int[] a = { 5, 4, 6, 7, 9, 8,7, 1, 2, 3 };
		sort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
