package baseJava.sortalg;

import java.util.Arrays;

/**
 * ��������ÿ��ѡ��һ��Ԫ�أ�����Ԫ�����������������Ԫ�رȽϣ�������Ӧλ�ã�ֱ������Ԫ���������ʱ�临�Ӷ�ΪO(n^2)
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
