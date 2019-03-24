package interfaceAndinnerClass.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval,boolean beep){}
	
	public void start(){
		TimePrinter listener = new TimePrinter();
		Timer t = new Timer(interval,listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Date now = new Date();
			System.out.println("At the tone,the time is " + now);
			if(beep){
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}

}
