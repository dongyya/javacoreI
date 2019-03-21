package objectAndClass.dateType;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTest {
	
	public static void main(String[] args) {
		output();
	}
	
	
	/**
	 * �������,2019-3
	 * Sun Mon Tue Wed Thu Fri Sat
	 *                      1   2
	 *  3   4   5   6   7   8   9
	 * 10  11  12  13  14  15* 16
	 * 17  18  19  20  21  22  23
	 * 24  25  26  27  28  29  30
	 * 31
	 */
	public static void output(){
		//����ʱ���ʽΪ����
		Locale.setDefault(Locale.US);
		//��ȡ��ǰ�գ������գ�
		GregorianCalendar gc = new GregorianCalendar();
		//��ȡ��������
		String[] weekName = new DateFormatSymbols().getShortWeekdays();
		for(int i = 0;i < weekName.length;i ++){
			System.out.printf("%4s",weekName[i]);
		}
		System.out.println();
		//��ǰ��
		int nowMonth = gc.get(Calendar.MONTH);
		int nowDay = gc.get(Calendar.DAY_OF_MONTH);
		//����ʱ��Ϊ�����գ����һ�ȡ�����ն�Ӧ������
		gc.set(Calendar.DAY_OF_MONTH, 1);
		int spaces = gc.get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY;
		System.out.printf("%4s","");
		for(int i = 0;i < spaces;i ++){
			System.out.printf("%4s", "");
		}
		while(gc.get(Calendar.MONTH) == nowMonth){
			System.out.printf("%3d", gc.get(Calendar.DAY_OF_MONTH));
			if(gc.get(Calendar.DAY_OF_MONTH) == nowDay){
				System.out.printf("*");
			}else{
				System.out.printf(" ");
			}
			if(gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
				System.out.println();//����
				System.out.printf("%4s","");
			}
			gc.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
