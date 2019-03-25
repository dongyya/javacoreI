package interfaceAndinnerClass.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {
	
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(5000, true);
		clock.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
	
class TalkingClock{
	private int interval;
	private boolean beep;
	public TalkingClock(int interval,boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start(){
		
		ActionListener t = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At this ton,the time is " + now);
				if(TalkingClock.this.beep){
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		Timer timer = new Timer(interval,t);
		timer.start();
	}
	
}
