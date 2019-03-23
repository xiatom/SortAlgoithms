package Sort;


public class BubbleSort {

	public static void main(String[] args) throws Exception {
		int []a = {5,4,6,7,9,8,1,2,3};
		
		for(int i:bubbleSort(a)){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:bubbleSort1(a)){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:bubbleSort2(a)){
			System.out.print(i+" ");
		}
	}
		//初始冒泡排序
		public static int[] bubbleSort(int[] before){
			long s1 = System.nanoTime();
			for(int j = 0;j<before.length-1;j++){
				for(int i=0;i<before.length-j-1;i++){
					if(before[i]>before[i+1]){
					int temp = before[i];
					before[i] = before[i+1];
					before[i+1] = temp;
					}
				}
			}
			long e1 = System.nanoTime();
			System.out.println("未优化："+(e1-s1)+"nm");
			return before;
		}
	
	//优化一：类似123456 98 这类前面已经有序，第一趟已经符合，然后第二趟发现没有改变就说明已经排好序，
	public static int[] bubbleSort1(int[] before){
		long s1 = System.nanoTime();
		boolean change = true;
		for(int j = 0;j<before.length-1 && change;j++){
			for(int i=0;i<before.length-j-1;i++){
				change = false;
				if(before[i]>before[i+1]){
				int temp = before[i];
				before[i] = before[i+1];
				before[i+1] = temp;
				change = true;
				}
			}
		}
		long e1 = System.nanoTime();
		System.out.println("优化一："+(e1-s1)+"nm");
		return before;
	}
	
	//优化二：类似231 456789这类后面已经有序，每趟最后一次交换的位置后面都是有序的
		public static int[] bubbleSort2(int[] before){
			long s2 = System.nanoTime();
			boolean change = true;
			int k = before.length-1;
			int judge = 0;
			for(int j = 0;j<before.length-1 && change;j++){
				for(int i=0;i<k;i++){
					change = false;
					if(before[i]>before[i+1]){
					int temp = before[i];
					before[i] = before[i+1];
					before[i+1] = temp;
					change = true;
					judge = i;//一会得到的judge就是后面都大于前面的
					}
				}
				k = judge;
			}
			long e2 = System.nanoTime();
			
			System.out.println("优化二："+(e2-s2)+"nm");
			return before;
		}

}
