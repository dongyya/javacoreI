package baseJava.inputoutput;

import java.util.Date;



//�������

public class InputOutput {
	
	public static void main(String[] args) {
		dateFormat();
	}
	
	public static void dateFormat(){
		//���������ں�ʱ��
		System.out.printf("%tc\n",new Date());
		//ISO 8601����
		System.out.printf("%tF\n",new Date());
		//������ʽ������
		System.out.printf("%tD\n",new Date());
		//24Сʱʱ��
		System.out.printf("%tT\n",new Date());
		//���ʽ
		System.out.printf("%tF %<tT\n",new Date());
		//String.format()
		String format = String.format("%tF %<tT", new Date());
		System.out.println("��ǰʱ�䣺\n" + format);
		//12Сʱʱ��
		System.out.printf("%tr\n", new Date());
		//24Сʱʱ��û����
		System.out.printf("%tR\n", new Date());	
		//4λ���ֵ��꣨ǰ�油0��
		System.out.printf("%tY\n", new Date());
		//������λ���֣�ǰ�油0��
		System.out.printf("%ty\n", new Date());
		//���ǰ��λ���֣�ǰ�油0��
		System.out.printf("%tC\n", new Date());
		//�µ�����ƴд
		System.out.printf("%tB\n", new Date());
		//ʱ���
		System.out.println(System.currentTimeMillis());
		//�Ӹ�������ʱ��1970-01-01 00:00:00��ĺ�����
		System.out.printf("%tQ", new Date());
	}
	
	public static void baseFormat(){
		//ʮ��������d
		System.out.printf("%d\n",10);
		//ʮ����������x
		System.out.printf("%x\n",10);
		//�˽�������o
		System.out.printf("%o\n",10);
		//���㸡����f
		System.out.printf("%1.2f\n",10.1);
		//���㸡����f
	    System.out.printf("%1.2f\n",10.1);
	    //1$ ָ����������
	    System.out.printf("ʮ���ƣ�%1$d��ʮ�����ƣ�%1$x\n", 10);
	    //<��ʽ��ǰ��˵������ֵ
	    System.out.printf("ʮ���ƣ�%d���˽��ƣ�%<o\n", 10);
	    //ʹ��%s��ʽ�����ж���
	    System.out.printf("%s\n", 10);
	    //ʹ��String.format����һ����ʽ�����ַ����������
	    String format = String.format("Hello��%s\n", "LiMing");
	    System.out.printf(format);
	}

}
