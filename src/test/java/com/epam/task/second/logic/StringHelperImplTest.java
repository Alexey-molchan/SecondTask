package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class StringHelperImplTest {

    private static final String CHANGE_CHARACTER_TWO_WORD = "H@llo S@m";
    private static final String CHANGE_CHARACTER_ONE_WORD = "He$lo";
    private static final String REPLACE_ONE_WORD = "Possibility";
    private static final String REPLACE_TWO_WORD = "Possibility possibility";
    private static final String REPLACE_SENTENCE_ONE_WORD = "GOT";
    private static final String REPLACE_SENTENCE_TWO_WORD = "sleep GOT good";

    @Test
    public void testChangeCharacterWhenOneWord(){

        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        String actual = stringHelper.changeCharacter("Hello", 3, '$');

        Assert.assertEquals(CHANGE_CHARACTER_ONE_WORD, actual);

    }

    @Test
    public void testChangeCharacterWhenTwoWord(){

        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        String actual = stringHelper.changeCharacter("Hello Sam", 2, '@');

        Assert.assertEquals(CHANGE_CHARACTER_TWO_WORD, actual);

    }

    @Test
    public void testReplaceWhenOneWord(){

        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        String actual = stringHelper.replace("Passibility", 'p', 'a', 'o');

        Assert.assertEquals(REPLACE_ONE_WORD, actual);

    }

    @Test
    public void testReplaceWhenTwoWord(){

        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        String actual = stringHelper.replace("Passibility passibility", 'p', 'a', 'o');

        Assert.assertEquals(REPLACE_TWO_WORD, actual);

    }

    @Test
    public void testReplaceSentenceWhenOneWord(){

        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        String actual = stringHelper.replaceSentence("sleep", 5, "GOT");

        Assert.assertEquals(REPLACE_SENTENCE_ONE_WORD, actual);

    }

    @Test
    public void testReplaceSentenceWhenTwoWord(){

        StringAndCharacterHelper stringHelper = new StringHelperImpl();

        String actual = stringHelper.replaceSentence("sleep aaaaaa good", 6, "GOT");

        Assert.assertEquals(REPLACE_SENTENCE_TWO_WORD, actual);

    }
}
