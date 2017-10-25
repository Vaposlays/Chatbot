package chat.controller;

import chat.view.PopupDisplay;

public class ChatRunner
{
	public static void main(String [] args)
	{
		PopupDisplay sample = new PopupDisplay();
		sample.displayText("asd");
		sample.collectResponse("asdadasd");
	}
}
