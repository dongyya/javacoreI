package baseJava.sortalg;

import java.util.Arrays;

/**
 * 插入排序：每次选择一个元素，将该元素与已排序的数组内元素比较，插入相应位置，直到所有元素完成排序，时间复杂度为O(n^2)
 * @author Administrator
 *
 */

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = {3,4,8,6,5,7,1,2,9};
		int[] arrnew = insertionSort(arr,arr.length);
		System.out.println(Arrays.toString(arrnew));
	}
	
	public static int[] insertionSort(int[] arr,int length){
		int[] newArr = new int[length];
		int i , j;
		for(i = 0;i < length;i ++){
			int temp = arr[i];
			for(j = i;j > 0 && arr[j-1] > temp; j --){
				arr[j] = arr[j-1];
			}
			arr[i] = temp;
			newArr[i] = arr[i];
		}
		return newArr;
	}

}
