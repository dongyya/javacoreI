package interfaceAndinnerClass.proxy;

public class LiuDeHua implements Person {

	@Override
	public String sing(String name) {
		// TODO Auto-generated method stub
		System.out.println("刘德华唱" + name + "歌!!!");
		return "唱完了，多谢大家！";
	}

	@Override
	public String dance(String name) {
		// TODO Auto-generated method stub
		System.out.println("刘德华跳" + name + "舞！！！");
		return "跳完了，多谢大家！";
	}

}
