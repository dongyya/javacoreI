package baseJava.inputoutput;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

//文件输入与输出
public class Fileinout {
	
	public static void main(String[] args) {
		filein();
	}
	
	public static void filein(){
		PrintWriter pw = null;
		try{
			pw = new PrintWriter("files\\filein.txt");
			pw.write("我爱北京天安门，天安门上太阳升！\n");
			pw.write("伟大领袖毛主席，指引我们向前进！");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(pw != null){
				pw.close();
			}
		}
	}
	
	public static void fileout(){
		Scanner scan = null;
		try{
			String dir = System.getProperty("user.dir");
			scan = new Scanner(Paths.get(dir + "\\files\\" + "fileout.txt"));
			StringBuilder sb = new StringBuilder();
			while(scan.hasNextLine()){
				sb.append(scan.nextLine()).append("\n");
			}
			System.out.println(sb.toString());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(scan != null){
				scan.close();
			}
		}
	}

}
