package baseJava.operator.incdec;

//自增与自减

public class Incdec {
	
	public static void main(String[] args) {
		int a = 7;
		int b = 7;
		int c = 2 * ++a;
		int d = 2 * b++;
		System.out.println(c);
		System.out.println(d);
	}

}
