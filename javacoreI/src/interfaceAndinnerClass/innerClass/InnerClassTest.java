package interfaceAndinnerClass.innerClass;

import javax.swing.JOptionPane;

public class InnerClassTest {
	
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(5000, true);
		clock.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
