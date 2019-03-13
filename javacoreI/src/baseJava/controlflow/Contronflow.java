package baseJava.controlflow;
//控制流程
public class Contronflow {

	public static void main(String[] args) {
		tagbreak();
	}
	
	public static void dowhile(){
		int i = 0;
		do{
			System.out.println("i:" + i);
			i ++;
		}while(i < 3);
	}
	
	public static void tagbreak(){
		tag:
		{
		   for(int i = 0;i < 10; i ++){
			   if(i == 5){
				   break tag;
			   }
			   System.out.println(i);
		   }
		}
	    
	    System.out.println("结束");
	
	}
	
	
}
