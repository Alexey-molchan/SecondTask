package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class StringHelperImplTest {

    private static final String CHANGE_CHARACTER_TWO_WORD = "He@lo Sam";
    private static final String CHANGE_CHARACTER_ONE_WORD = "He@lo";
    private static final String REPLACE_ONE_WORD = "Possibility";
    private static final String REPLACE_TWO_WORD = "Possibility possibility";
    private static final String REPLACE_SENTENCE_ONE_WORD = "GOT";
    private static final String REPLACE_SENTENCE_TWO_WORD = "GOT good";

    @Test
    public void testChangeCharacterWhenOneWord(){

        StringHelperImpl stringHelper = new StringHelperImpl();

        String actual = stringHelper.changeCharacter("Hello");

        Assert.assertEquals(CHANGE_CHARACTER_ONE_WORD, actual);

    }

    @Test
    public void testChangeCharacterWhenTwoWord(){

        StringHelperImpl stringHelper = new StringHelperImpl();

        String actual = stringHelper.changeCharacter("Hello Sam");

        Assert.assertEquals(CHANGE_CHARACTER_TWO_WORD, actual);

    }

    @Test
    public void testReplaceWhenOneWord(){

        StringHelperImpl stringHelper = new StringHelperImpl();

        String actual = stringHelper.replace("Passibility");

        Assert.assertEquals(REPLACE_ONE_WORD, actual);

    }

    @Test
    public void testReplaceWhenTwoWord(){

        StringHelperImpl stringHelper = new StringHelperImpl();

        String actual = stringHelper.replace("Passibility passibility");

        Assert.assertEquals(REPLACE_TWO_WORD, actual);

    }

    @Test
    public void testReplaceSentenceWhenOneWord(){

        StringHelperImpl stringHelper = new StringHelperImpl();

        String actual = stringHelper.replaceSentence("sleep");

        Assert.assertEquals(REPLACE_SENTENCE_ONE_WORD, actual);

    }

    @Test
    public void testReplaceSentenceWhenTwoWord(){

        StringHelperImpl stringHelper = new StringHelperImpl();

        String actual = stringHelper.replaceSentence("sleep good");

        Assert.assertEquals(REPLACE_SENTENCE_TWO_WORD, actual);

    }
}
