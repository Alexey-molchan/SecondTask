package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class CharacterHelperImplTest {

    private static final String CHANGE_CHARACTER_TWO_WORD = "H@llo S@m";
    private static final String CHANGE_CHARACTER_ONE_WORD = "He$lo";
    private static final String REPLACE_ONE_WORD = "Possibility";
    private static final String REPLACE_TWO_WORD = "Possibility possibility";
    private static final String REPLACE_SENTENCE_ONE_WORD = "GOT";
    private static final String REPLACE_SENTENCE_TWO_WORD = "sleep GOT";

    @Test
    public void testChangeCharacterWhenOneWord(){

        StringAndCharacterHelper characterHelper = new CharacterHelperImpl();

        String actual = characterHelper.changeCharacter("Hello", 3, '$');

        Assert.assertEquals(CHANGE_CHARACTER_ONE_WORD, actual);

    }

    @Test
    public void testChangeCharacterWhenTwoWord(){

        StringAndCharacterHelper characterHelper = new CharacterHelperImpl();

        String actual = characterHelper.changeCharacter("Hello Sam", 2, '@');

        Assert.assertEquals(CHANGE_CHARACTER_TWO_WORD, actual);

    }

    @Test
    public void testReplaceWhenOneWord(){

        StringAndCharacterHelper characterHelper = new CharacterHelperImpl();

        String actual = characterHelper.replace("Passibility", 'p', 'a', 'o');

        Assert.assertEquals(REPLACE_ONE_WORD, actual);

    }

    @Test
    public void testReplaceWhenTwoWord(){

        StringAndCharacterHelper characterHelper = new CharacterHelperImpl();

        String actual = characterHelper.replace("Passibility passibility", 'p', 'a', 'o');

        Assert.assertEquals(REPLACE_TWO_WORD, actual);

    }

    @Test
    public void testReplaceSentenceWhenOneWord(){

        StringAndCharacterHelper characterHelper = new CharacterHelperImpl();

        String actual = characterHelper.replaceSentence("sleep", 5, "GOT");

        Assert.assertEquals(REPLACE_SENTENCE_ONE_WORD, actual);

    }

    @Test
    public void testReplaceSentenceWhenTwoWord(){

        StringAndCharacterHelper characterHelper = new CharacterHelperImpl();

        String actual = characterHelper.replaceSentence("sleep good", 4, "GOT");

        Assert.assertEquals(REPLACE_SENTENCE_TWO_WORD, actual);

    }
}
