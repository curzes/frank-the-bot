package Bot.ChatterApi;

import java.util.Locale;

public interface ChatterBot {
    
    ChatterBotSession createSession(Locale... locales);
}