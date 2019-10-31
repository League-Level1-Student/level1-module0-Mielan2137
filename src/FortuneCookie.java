import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	public void showButton() {
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		
		JButton button = new JButton();
		
		frame.add(button);
		
		frame.pack();
		
		button.addActionListener(this);
		
		button.setText("Woohoo");
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		int random = new Random().nextInt(5);
		
		if(random==0) {
			JOptionPane.showMessageDialog(null, "You dont look like poop today");
		}
		if(random==1) {
			JOptionPane.showMessageDialog(null, "You dont look like a dogs scrat today");
		}
		if(random==2) {
			JOptionPane.showMessageDialog(null, "You dont look like shat today");
		}
		if(random==3) {
			JOptionPane.showMessageDialog(null, "You dont look like a turd today");
		}
		if(random==4) {
			JOptionPane.showMessageDialog(null, "You dont look like a duece today");
		}
		
		// TODO Auto-generated method stub
		
	}

}
