package interfaceAndinnerClass.proxy;

public class LiuDeHua implements Person {

	@Override
	public String sing(String name) {
		// TODO Auto-generated method stub
		System.out.println("���»���" + name + "��!!!");
		return "�����ˣ���л��ң�";
	}

	@Override
	public String dance(String name) {
		// TODO Auto-generated method stub
		System.out.println("���»���" + name + "�裡����");
		return "�����ˣ���л��ң�";
	}

}
