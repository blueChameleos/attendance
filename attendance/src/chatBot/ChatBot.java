package chatBot;

public class ChatBot {
	private String username;
	private boolean chatting;
	private Topic Weixiong;
	
	public ChatBot() {
		Weixiong = new ChatBotWei();
		username = "Unknown User";
		chatting = true;
	}

	public void startChatting() {
		ChatBotMain.print("Hi! I am an intelligent machine that can respond to your input. Tell me your name.");
		username = ChatBotMain.getInput();
		
		while(chatting) {
			ChatBotMain.print("What would you like to talk about?");
			String response = ChatBotMain.getInput();
			
			if(Weixiong.isTriggered(response)) {
				chatting = false; //will exit the while loop. IMPORTANT you get graded for this!
				Weixiong.talk(response);
			}
			else {
				ChatBotMain.print("I'm sorry. I don't understand");
			}
		}
		
	}

}
