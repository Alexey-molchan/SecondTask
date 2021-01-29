package com.epam.task.second;

import com.epam.task.second.logic.StringHelper;
import com.epam.task.second.logic.StringHelperImpl;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("Program started");

        StringHelper stringHelper = new StringHelperImpl();
        stringHelper.changeCharacter("Привет, как у тебя дела?");
        System.out.println(" ");

        LOGGER.info("Program finished");




    }
}
