package com.epam.task.second.logic;

public class CharacterHelperImpl implements StringAndCharacterHelper {

    private static final String REG_EX1 = "[\\s\\.\\!\\,]";

    public String changeCharacter(String oldSentence, int numberOldSymbol, char newSymbol) {

        String sentence = "";
        String[] words = oldSentence.split(REG_EX1);
        for (int i = 0; i < words.length; i++) {
            char[] str = words[i].toCharArray();
            for (int j = 0; j <= str.length; j++) {
                if (j == numberOldSymbol) {
                    str[j - 1] = newSymbol;
                }
            }
            words[i] = String.valueOf(str);
        }
        for (int i = 0; i < words.length; i++) {
            sentence = sentence.concat(words[i]);
            if (i != words.length - 1) {
                sentence = sentence.concat(" ");
            }
        }
        return sentence;
    }

    public String replace(String oldSentence, char letterTochange, char falseLetter, char trueLetter) {

        char[] strToArray = oldSentence.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == letterTochange || i != strToArray.length - 1) {
                if (strToArray[i + 1] == falseLetter) {
                    strToArray[i + 1] = trueLetter;
                }
            }
        }
        return String.valueOf(strToArray);
    }

    public String replaceSentence(String oldSentence, int wordLength, String newSentence) {

        String sentence = "";
        String[] words = oldSentence.split(REG_EX1);
        for (int i = 0; i < words.length; i++) {
            char[] str = words[i].toCharArray();
            for (int j = 0; j < str.length; j++) {
                if (str.length == wordLength) {
                    words[i] = newSentence;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            sentence = sentence.concat(words[i]);
            if (i != words.length - 1) {
                sentence = sentence.concat(" ");
            }
        }

        return sentence;
    }
}
