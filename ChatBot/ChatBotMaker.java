import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextArea area= new JTextArea();				//area that displays text
	private JTextField field=new JTextField();              //the editting line
	private JButton button=new JButton();					//the button
	private JLabel label=new JLabel();						//labels
	
	Chatbot(){                                                //layout and properties                                       
		
		JFrame frame=new JFrame();                                     
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(400,400);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setTitle("ChatBot");
		frame.add(area);
		frame.add(field);
		area.setSize(300,310);
		area.setLocation(1, 1);
		area.setBackground(Color.BLACK);
		field.setSize(300,20);
		field.setLocation(1,320);
		frame.add(button);
		label.setText("SEND");
		button.add(label);
		button.setSize(400,20);
		button.setLocation(300,320);
		
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==button) {                           //message sent when click button
					
					String text=field.getText().toLowerCase();
					area.setForeground(Color.GREEN);
					area.append("You-->"+text+"\n");
					field.setText("");
					
					if(text.contains("hi")) {                         //checks if that word or phrase is found
						reply("Hello.");
					}
					else if(text.contains("how are you")) {
						reply("I'm good. You?");
					}
					else if(text.contains("old")) {
						reply("I was just made recently.");
					}
					else if(text.contains("gender")) {
						reply("I'm male, you?");
					}
					else if(text.contains("hungry")) {
						reply("Me too.");
					}
					else if(text.contains("funny")) {
						reply("Haha, it was.");
					}
					else if(text.contains("kid")) {
						reply("I'm only 8.");
					}
					else if(text.contains("food")) {
						reply("I don't eat.");
					}
					else if(text.contains("no")) {
						reply("Why not?");
					}
					else if(text.contains("later")) {
						reply("Why later?");
					}
					else if(text.contains("because")) {
						reply("That's too complicated");
					}
					else if(text.contains("bye")) {
						reply("See you later!");
					}
					else 
						reply("I don't understand");
					
				}
				
			}
			
		});
		
	}
	public void reply(String s) {                          //the reply method
		area.append("ChatBot-->"+s+"\n");         
	}
			

}



public class ChatBotMaker {                                     //create the bot

	public static void main(String[] args) {             
		
          new Chatbot();                                   
	}

}
