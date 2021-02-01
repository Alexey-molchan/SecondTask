package com.epam.task.second;

import com.epam.task.second.logic.CharacterHelperImpl;
import com.epam.task.second.logic.StringAndCharacterHelper;
import com.epam.task.second.logic.StringHelperImpl;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("Program started");
        StringAndCharacterHelper stringAndCharacterHelper = new CharacterHelperImpl();


        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        System.out.println(" ");
        System.out.println(stringHelper.changeCharacter("Hello im", 3, '@'));
//        System.out.println(stringAndCharacterHelper.replace("passability, passability"));
        System.out.println(stringAndCharacterHelper.replaceSentence("how are you", 3, "GOT"));
        System.out.println(stringAndCharacterHelper.changeCharacter("It was very nice", 3, '#'));
        LOGGER.info("Program finished");




    }
}
