package interfaceAndinnerClass.proxy;

public class ProxyTest {
	
	public static void main(String[] args) {
		//��ô���
		LiuDeHuaProxy proxy = new LiuDeHuaProxy();
		//��ȡ�������
		Person p = proxy.getProxy();
		//���ô����sing����
	    String value = p.sing("����");
	    System.out.println(value);
	    //���ô����dance����
	    String danceValue = p.dance("����style");
	    System.out.println(danceValue);
	}

}
