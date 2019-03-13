package baseJava.inputoutput;

import java.util.Date;



//输入输出

public class InputOutput {
	
	public static void main(String[] args) {
		dateFormat();
	}
	
	public static void dateFormat(){
		//完整的日期和时间
		System.out.printf("%tc\n",new Date());
		//ISO 8601日期
		System.out.printf("%tF\n",new Date());
		//美国格式的日期
		System.out.printf("%tD\n",new Date());
		//24小时时间
		System.out.printf("%tT\n",new Date());
		//组合式
		System.out.printf("%tF %<tT\n",new Date());
		//String.format()
		String format = String.format("%tF %<tT", new Date());
		System.out.println("当前时间：\n" + format);
		//12小时时间
		System.out.printf("%tr\n", new Date());
		//24小时时间没有秒
		System.out.printf("%tR\n", new Date());	
		//4位数字的年（前面补0）
		System.out.printf("%tY\n", new Date());
		//年后的两位数字（前面补0）
		System.out.printf("%ty\n", new Date());
		//年的前两位数字（前面补0）
		System.out.printf("%tC\n", new Date());
		//月的完整拼写
		System.out.printf("%tB\n", new Date());
		//时间戳
		System.out.println(System.currentTimeMillis());
		//从格林威治时间1970-01-01 00:00:00起的毫秒数
		System.out.printf("%tQ", new Date());
	}
	
	public static void baseFormat(){
		//十进制整数d
		System.out.printf("%d\n",10);
		//十六进制整数x
		System.out.printf("%x\n",10);
		//八进制整数o
		System.out.printf("%o\n",10);
		//定点浮点数f
		System.out.printf("%1.2f\n",10.1);
		//定点浮点数f
	    System.out.printf("%1.2f\n",10.1);
	    //1$ 指定参数索引
	    System.out.printf("十进制：%1$d，十六进制：%1$x\n", 10);
	    //<格式化前面说明的数值
	    System.out.printf("十进制：%d，八进制：%<o\n", 10);
	    //使用%s格式化所有对象
	    System.out.printf("%s\n", 10);
	    //使用String.format创建一个格式化的字符串，不输出
	    String format = String.format("Hello，%s\n", "LiMing");
	    System.out.printf(format);
	}

}
