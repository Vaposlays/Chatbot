package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatController;

/**
 * 
 * @author mchi3485
 *
 */	
public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;

	public ChatFrame(ChatController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ChatPanel(appController);
		
		setupFrame();
	}
	
	/**
	 * 
	 */
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Chatbot 2017");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
