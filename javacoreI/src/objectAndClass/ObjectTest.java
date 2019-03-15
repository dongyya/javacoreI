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
	 * 实现展示当前月日历
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
		//获取星期的简称
		DateFormatSymbols dateFromatSymbols = new DateFormatSymbols();
		String[] dayOfweekName = dateFromatSymbols.getShortWeekdays();
		for(int i = 0;i < dayOfweekName.length;i ++){
			System.out.printf("%4s",dayOfweekName[i]);
		}
		System.out.println();
		//获取当前日
		GregorianCalendar gc = new GregorianCalendar();
		int nowDay = gc.get(Calendar.DAY_OF_MONTH);
		//获取当前月
		int nowMonth = gc.get(Calendar.MONTH);
		//设置为当前月的第一天
		gc.set(Calendar.DAY_OF_MONTH, 1);
		//获取当月第一天对应的星期
		int firstDayNameOfweek = gc.get(Calendar.DAY_OF_WEEK);
		//计算第一天对应星期与星期日的差距
		int gap = firstDayNameOfweek - gc.getFirstDayOfWeek();
		for(int i = 0;i < gap;i ++){
			System.out.printf("    ");
		}
		System.out.printf("    ");
		do{
			System.out.printf("%3d",gc.get(Calendar.DAY_OF_MONTH));
			//如果是当前日，则加*
			if(nowDay == gc.get(Calendar.DAY_OF_MONTH)){
				System.out.printf("*");
			}else{
				System.out.printf(" ");
			}
			gc.add(Calendar.DAY_OF_MONTH, 1);//加一天
			//如果当前日是一周的最后一天，则换行
			if(gc.get(Calendar.DAY_OF_WEEK) == gc.getFirstDayOfWeek()){
				System.out.println();
				System.out.printf("    ");
			}
		}while(gc.get(Calendar.MONTH) == nowMonth);
		
	}

}
