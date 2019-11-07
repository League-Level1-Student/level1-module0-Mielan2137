package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.*;

public class JackInTheBox implements ActionListener{
		//1.  declare all JComponents
		JFrame frame = new JFrame();
		
		JLabel label = new JLabel();
		
		JLabel JIBI = new JLabel();
		
		String JIB = "JackInTheBox.png";

		//2.  call your createUI method (shown below)
		public static void main(String[] args){
			new JackInTheBox().createUI();
		}

		//3.  make a createUI() method (shown below)
		void createUI(){
			
		//4.  initialize all JComponents


		//5.  add them all together
		

		//6.  add any listeners


		//7.  pack frame and setVisible


		}
		
		//8.  add "implements ActionListener" to the class declaration (shown above) 
		//9.  import ActionListener, then click on the name of the class and select "add unimplemented methods" (this will add the actionPerformed method shown below)
		public void actionPerformed(ActionEvent e) {
			JButton buttonPressed = (JButton) e.getSource();
			
			
			
			JIBI = createLabelImage(JIB);

			frame.add(JIBI);
			
			frame.setVisible(true);
			
			frame.pack();
			
		}

		
		
		
		
		
		
		
		private void showPicture(String fileName) { 
		     try {
		          JLabel imageLabel = createLabelImage(fileName);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}

		private JLabel createLabelImage(String fileName) {
		     try {
		          java.net.URL imageURL = getClass().getResource(fileName);
		          if (imageURL == null) {
		               System.err.println("Could not find image " + fileName);
		               return new JLabel();
		          } else {
		               Icon icon = new ImageIcon(imageURL);
		               JLabel imageLabel = new JLabel(icon);
		               return imageLabel;
		          }
		     } catch (Exception e) {
		          System.err.println("Could not find image " + fileName);
		          return new JLabel();
		     }
		}


	}
	   

