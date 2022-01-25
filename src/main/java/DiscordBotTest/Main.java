package DiscordBotTest;

import BotConstants.Constants;
import InsultFiles.CreateFile;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main implements Constants {

    public static void main(String[] args){
        System.out.println("Discord Test Bot");

        setup();
        CreateFile.createFile();
    }

    public static void setup() {
        JDABuilder jda = JDABuilder.createDefault(Constants.TOKEN);
        jda.setActivity(Activity.watching("books"));
        jda.setStatus(OnlineStatus.ONLINE);
        jda.addEventListeners(new Commands());

        try {

            jda.build();
        } catch(LoginException e) {

            System.out.println("Error: " + e);
        }
    }
}
