package DiscordBotTest;

import BotConstants.Constants;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    private static String prefix = "!";

    public void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("  ");
        String channelID = event.getChannel().getId();

        if(!event.getMember().getId().equals(Constants.BOT_MEMBER_ID)) {

            switch(channelID) {

                case Constants.GENERAL_CHANNEL:

                    // General channel functions
                    if(args[0].equals("hi " + Constants.BOT_NAME)) {

                        event.getChannel().sendMessage("Hello, world! I'm " + Constants.BOT_NAME).queue();
                    }

                case Constants.INSULT_GENERATOR_CHANNEL:

                    if(args[0].equals("sauce me an insult")) {

                        event.getChannel().sendMessage("eww").queue();
                    }
            }
        }
    }
}
