package InsultFiles;

import BotConstants.Constants;

import java.io.File;
import java.io.IOException;

public class CreateFile implements Constants {
    private static File insultFile = new File(Constants.INSULTS);

    public static void createFile() {

        try {

            if(insultFile.createNewFile()) {

                System.out.println("Successfully created " + insultFile.getName());
            } else {

                System.out.println(insultFile.getName() + " Already exists");
            }

        } catch(IOException e) {

            System.out.println("Error" + e);
        }
    }
}
