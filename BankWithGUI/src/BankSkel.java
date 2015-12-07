import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class BankSkel {

	private double balance;
	
	private JLabel labelBalance;
	private JButton depositButton;
	private JButton withdrawButton;
	
	
	public BankSkel(){
		
		balance = 0.0;
		
		
		depositButton = new JButton ("Deposit");
		
	}
	
	private class BankEventListener implements ActionListener{
		
		public void actionPreformed(ActionEvent event){
			if(event.getSource() == depositButton){
				
			}
		}
		
	}
	
}


