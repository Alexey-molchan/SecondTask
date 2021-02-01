package com.epam.task.second.logic;

import org.apache.log4j.Logger;

import java.util.regex.Pattern;


public class StringHelperImpl implements StringAndCharacterHelper {

    private final static Logger LOGGER = Logger.getLogger(StringHelperImpl.class);


    private static final String REG_EX1 = "[\\s\\.\\!\\,]";
    private static final String REG_EX2 = "\\b[a-zA-Z]{5}\\b";


    public String changeCharacter(String requiredStr, int numberOldSymbol, char newSymbol) {

        String temp;
        String[] words = requiredStr.split(REG_EX1);
        for (int i = 0; i < words.length; i++) {
            if (numberOldSymbol < words[i].length()) {
                temp = "";
                temp += words[i].substring(0, numberOldSymbol - 1);
                temp += newSymbol;
                temp += words[i].substring(numberOldSymbol);
                words[i] = temp;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);
            if (i != words.length - 1) {
                builder.append(" ");
            }
        }
        requiredStr = builder.toString();
        return requiredStr;
    }

    public String replace(String oldSentence, char letterTochange, char falseLetter, char trueLetter) {

        String upperLetterP = Character.toString(letterTochange).toUpperCase();
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        StringBuilder builder3 = new StringBuilder();
        StringBuilder builder4 = new StringBuilder();


        return oldSentence.replace(
                builder1.append(upperLetterP).append(falseLetter),
                builder2.append(upperLetterP).append(trueLetter)
            )
            .replace(
                builder3.append(letterTochange).append(falseLetter),
                builder4.append(letterTochange).append(trueLetter)
            );

    }

    public String replaceSentence(String oldSentence, int wordLength, String newSentence) {

        return oldSentence.replaceAll(String.valueOf("\\b[a-zA-Z]{" + wordLength + "}\\b"), newSentence);
    }
}
