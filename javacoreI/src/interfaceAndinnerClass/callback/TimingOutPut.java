package interfaceAndinnerClass.callback;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimingOutPut{
	
	public static void main(String[] args) {
		ActionListen top = new ActionListen();
		Timer timer = new Timer(10000,top);
		timer.start();
		JOptionPane.showMessageDialog(null, "Quit program");
		System.exit(0);
	}

}

class ActionListen implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date now = new Date();
        System.out.println("这一刻，时间是：" + now);
        //击打
        Toolkit.getDefaultToolkit().beep();
	}
}
