package baseJava.operator.relationOperator;

//��ϵ�����
public class RelationOperator {
	
	public static void main(String[] args) {
		//�Ƿ����
		System.out.println(7 == 3);
		//��Ŀ�����
		@SuppressWarnings("unused")
		String str = 7!=3 ? "7������3":"7����3";
		System.out.println(str);
		
		double math = 4;
		double result = Math.sqrt(math);
		System.out.println(result);
		
		double m = Math.pow(4, 2);
		System.out.println(m);
	}

}
