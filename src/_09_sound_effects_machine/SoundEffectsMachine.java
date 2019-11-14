package _09_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener{

	
	
	JButton A = new JButton();
	JButton B = new JButton();
	JButton C = new JButton();
	
	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		
		A.addActionListener(this);
		B.addActionListener(this);
		C.addActionListener(this);
		panel.add(A);
		panel.add(B);
		panel.add(C);
		frame.add(panel);
		A.setText("Click Here Mate");
		B.setText("Click Here Mate");
		C.setText("Click Here Mate");
		frame.pack();
	}
	
	
	
public static void main(String[] args) {
	
new SoundEffectsMachine().showButton();


	
}


private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==A) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if(e.getSource()==B) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if(e.getSource()==C) {
		playSound("sawing-wood-daniel_simon.wav");
	}
}
}
