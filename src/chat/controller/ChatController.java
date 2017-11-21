package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.PopupDisplay;

public class ChatController
{
	private Chatbot chatbot;
	private PopupDisplay display;
	private ChatFrame appFrame;

	public ChatController()
	{
		chatbot = new Chatbot("Mason Childers");
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		display.displayText("Welcome to chatbot");
		String response = display.collectResponse("What do you want to talk about?");
		
//		while ( chatbot.lengthChecker(response) && !chatbot.quitChecker(response))
//		{
//			response = popupChat(response);
//			response = display.collectResponse(response);
//		}
	}
	
	public String interactWithChatbot(String input)
	{
		String chatbotSays ="";
		
		if(chatbot.quitChecker(input))
		{
			close();
		}
		
		chatbotSays += chatbot.processConversation(input);
		
		return chatbotSays;
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
//	private String popupChat(String chat)
//	{
//		String chatbotSays = "";
//		
//		chatbotSays += chatbot.processConversation(chat);
//		
//		return chatbotSays;
	}

