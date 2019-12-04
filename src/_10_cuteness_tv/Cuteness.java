package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cuteness implements ActionListener {
	
	public Cuteness() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton button = new JButton();
		
		button.setText("Click Here");
		
		button.addActionListener(this);
		
		frame.add(button);
		
		frame.pack();
	}
	
	public static void main(String[] args) {
		
		Cuteness a = new Cuteness();
	
	
	
	
	
	
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		int random = new Random().nextInt(3);
		
		if(random==0) {
			showDucks();
		}
		if(random==1) {
			showFrog();
		}
		if(random==2) {
			showFluffyUnicorns();
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
