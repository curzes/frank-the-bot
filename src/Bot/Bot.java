package Bot;

import com.sun.speech.freetts.VoiceManager;

import Bot.ChatterApi.ChatterBot;
import Bot.ChatterApi.ChatterBotFactory;
import Bot.ChatterApi.ChatterBotSession;
import Bot.ChatterApi.ChatterBotType;

public class Bot {

	private String name = "Frank";
	private ChatterBotSession botsession;
	private com.sun.speech.freetts.Voice voice;
	
	public Bot() throws Exception{
				
		// Give the bot a voice
		voice = VoiceManager.getInstance().getVoice( "kevin16" );
		voice.allocate();
		
		// Create the bot
		ChatterBotFactory factory = new ChatterBotFactory();
		ChatterBot bot = factory.create(ChatterBotType.CLEVERBOT);
		botsession = bot.createSession();
	}
	
	public void speak(String sentence) throws Exception{
		System.out.println( name + " say: " + sentence );
		voice.speak(sentence);
	}
	
	public void tell(String sentence) throws Exception{
		System.out.println("You say: " + sentence);
		speak( botsession.think(sentence) );
	}
	
	public String getName(){
		return name;
	}

}
