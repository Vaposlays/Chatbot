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
	
	public String useCheckers(String text)
	{
		String response = "";
		
		if(chatbot.contentChecker(text))
		{
			response += "This text matches the special content\n";
		}
		if(chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
		}
		if(chatbot.userNameChecker(text))
		{
			response += "";
		}
		if(chatbot.shoppingListChecker(text))
		{
			response += "";
		}
		if(chatbot.movieTitleChecker(text))
		{
			response += "";
		}
		if(chatbot.movieGenreChecker(text))
		{
			response += "";
		}
		
		return response;
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

