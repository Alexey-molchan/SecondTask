package com.epam.task.second.logic;

public interface StringAndCharacterHelper {

    String changeCharacter(String s, int numberOldSymbol, char newSymbol);

    String replace(String oldSentence, char letterTochange, char falseLetter, char trueLetter);

    String replaceSentence(String oldSentence, int wordLength,  String newSentence);

}
