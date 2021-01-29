package com.epam.task.second.logic;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class StringHelperImpl implements StringHelper {



    private static final String REG_EX1 = "[\\s\\.\\!\\,]";
    private static final String REG_EX2 = "\\b[a-zA-Z]{5}\\b";

    public String changeCharacter(String requiredStr) {

        LOGGER.info("Method changeCharacter started");

            int symbol = 3;
            String temp;
            String[] words = requiredStr.split(REG_EX1);
            for (int i = 0; i < words.length; i++) {
                if (symbol < words[i].length()) {
                    temp = "";
                    temp += words[i].substring(0, symbol - 1);
                    temp += '@';
                    temp += words[i].substring(symbol);
                    words[i] = temp;
                }
            }
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < words.length; i++) {
                builder.append(words[i]);
                if (i != words.length- 1){
                    builder.append(" ");
                }
            }
            requiredStr = builder.toString();

        LOGGER.info("Method changeCharacter finished");

        return requiredStr;

    }

    public String replace(String text) {

        return text.replace("Pa", "Po").replace("pa", "po");

    }

    public String replaceSentence(String sentence) {

        String name = "GOT";

        return sentence.replaceAll(REG_EX2, name);
    }
}
