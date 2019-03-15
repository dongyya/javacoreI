package objectAndClass;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class ObjectTest {
	
	
	public static void main(String[] args) {
		String time = String.format("%tF %<tT", new Date());
		System.out.println(time);
	}
	
	/**
	 * ʵ��չʾ��ǰ������
	 * Sun Mon Tue Wed Thu Fri Sat
	 *                      1   2
	 *  3   4   5   6   7   8   9
	 * 10  11  12* 13  14  15  16
	 * 17  18  19  20  21  22  23
	 * 24  25  26  27  28  29  30
	 * 31                    
	 */
	public static void testDate(){
		Locale.setDefault(Locale.US);
		//��ȡ���ڵļ��
		DateFormatSymbols dateFromatSymbols = new DateFormatSymbols();
		String[] dayOfweekName = dateFromatSymbols.getShortWeekdays();
		for(int i = 0;i < dayOfweekName.length;i ++){
			System.out.printf("%4s",dayOfweekName[i]);
		}
		System.out.println();
		//��ȡ��ǰ��
		GregorianCalendar gc = new GregorianCalendar();
		int nowDay = gc.get(Calendar.DAY_OF_MONTH);
		//��ȡ��ǰ��
		int nowMonth = gc.get(Calendar.MONTH);
		//����Ϊ��ǰ�µĵ�һ��
		gc.set(Calendar.DAY_OF_MONTH, 1);
		//��ȡ���µ�һ���Ӧ������
		int firstDayNameOfweek = gc.get(Calendar.DAY_OF_WEEK);
		//�����һ���Ӧ�����������յĲ��
		int gap = firstDayNameOfweek - gc.getFirstDayOfWeek();
		for(int i = 0;i < gap;i ++){
			System.out.printf("    ");
		}
		System.out.printf("    ");
		do{
			System.out.printf("%3d",gc.get(Calendar.DAY_OF_MONTH));
			//����ǵ�ǰ�գ����*
			if(nowDay == gc.get(Calendar.DAY_OF_MONTH)){
				System.out.printf("*");
			}else{
				System.out.printf(" ");
			}
			gc.add(Calendar.DAY_OF_MONTH, 1);//��һ��
			//�����ǰ����һ�ܵ����һ�죬����
			if(gc.get(Calendar.DAY_OF_WEEK) == gc.getFirstDayOfWeek()){
				System.out.println();
				System.out.printf("    ");
			}
		}while(gc.get(Calendar.MONTH) == nowMonth);
		
	}

}
