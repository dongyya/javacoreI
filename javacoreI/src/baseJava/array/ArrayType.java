package baseJava.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//��������
public class ArrayType {
	
	public static void main(String[] args) {
		sortTest();
	}
	
	public static void sortTest(){
		int[] data = new int[] {5,8,6,7,2,9,1,0}; 
		Arrays.sort(data); 
		System.out.println("������: "+ Arrays.toString(data)); 
		System.out.println("6��Ӧ���±��ǣ�" + Arrays.binarySearch(data, 6)); 
		System.out.println("3��Ӧ���±��ǣ�" + Arrays.binarySearch(data, 3)); 
		System.out.println("4��Ӧ���±��ǣ�" + Arrays.binarySearch(data, 4)); 
		System.out.println("9��Ӧ���±��ǣ�" + Arrays.binarySearch(data, 9)); 
		System.out.println("-1��Ӧ���±��ǣ�" + Arrays.binarySearch(data, -1));
		System.out.println("11��Ӧ���±��ǣ�" + Arrays.binarySearch(data, 11));
	}
	
	
	public static void test(){
		List<String> list = new ArrayList<String>();
	}

}
