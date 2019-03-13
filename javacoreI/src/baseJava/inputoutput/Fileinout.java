package baseJava.inputoutput;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

//�ļ����������
public class Fileinout {
	
	public static void main(String[] args) {
		filein();
	}
	
	public static void filein(){
		PrintWriter pw = null;
		try{
			pw = new PrintWriter("files\\filein.txt");
			pw.write("�Ұ������찲�ţ��찲����̫������\n");
			pw.write("ΰ������ë��ϯ��ָ��������ǰ����");
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
