package interfaceAndinnerClass.innerClass;

import interfaceAndinnerClass.innerClass.TalkingClock.TimePrinter;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock1 {
	
	private int interval;
	private boolean beep;
	
	public TalkingClock1(int interval,boolean beep){}
	
	public void start(){
		TimePrinter listener = new TimePrinter();
		Timer t = new Timer(interval,listener);
		t.start();
	}
	
}

class TimePrinter implements ActionListener{
	
	private TalkingClock1 outer;
	
	public TimePrinter(TalkingClock1 clock){
		outer = clock;
	}

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
