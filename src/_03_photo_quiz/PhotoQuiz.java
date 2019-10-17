package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
	String I = ("https://cdn.imgbin.com/13/19/2/imgbin-scooby-doo-shaggy-rogers-daphne-blake-film-scared-turkey-NVbGAjWBW66TdK65hXEQTWTE0.jpg");

		// 2. create a variable of type "Component" that will hold your image
	Component S;

		// 3. use the "createImage()" method below to initialize your Component
	S = createImage(I);
	
		// 4. add the image to the quiz window
	quizWindow.add(S);

		// 5. call the pack() method on the quiz window
	quizWindow.pack();

		// 6. ask a question that relates to the image
	String Q = JOptionPane.showInputDialog("who is in the Image?");

		// 7. print "CORRECT" if the user gave the right answer
	if(Q.contentEquals("scooby doo")) {
		JOptionPane.showMessageDialog(null, "Correct");
	}

		// 8. print "INCORRECT" if the answer is wrong
	else{
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
	

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
	quizWindow.remove(S);

		// 10. find another image and create it (might take more than one line
		// of code)
		String O = ("data:image/jpeg;base64,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");
		Component OP;
		OP = createImage(O);
		
		// 11. add the second image to the quiz window
		quizWindow.add(OP);
		
		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		String OPS = JOptionPane.showInputDialog("Who is thedog in this Picture?");

		// 14+ check answer, say if correct or incorrect, etc.
		if(OPS.contentEquals("beethoven")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}
	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
