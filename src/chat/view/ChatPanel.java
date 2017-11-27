package chat.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chat.controller.ChatController;
/**
 * 
 * @author Mason Childers
 *
 */
public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private JButton checkerButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	
	/**
	 * 
	 * @param appController
	 */
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		
		//Initialize GUI data members
		chatButton = new JButton("chat");
		chatArea = new JTextArea(10,25);
		inputField = new JTextField(20);
		appLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Lets you add the layout and all the components to what you want to put on the popup
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);	
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(inputField);
		this.add(chatArea);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);
	}
	
	/**
	 * Shows the position of everything thats in setupPanel
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, chatArea);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -37, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -25, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.interactWithChatbot(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});
		
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.useCheckers(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});
	}
	
}
