package com.gradle.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChanceTest {
    private Chance chance;
    private Chance chanceAnother;

    @Before
    public void setUp() throws Exception {
        chance = new Chance(0.56d);
        chanceAnother = new Chance(0.2d);
    }

    @Test
    public void should_get_not_chance() {
        //given
        //when
        Chance chanceNot = chance.not();
        //then
        Assert.assertEquals(chanceNot, new Chance(1 - chance.getFraction()));
    }

    @Test
    public void should_get_and_chance() {
        //given
        //when
        Chance chanceAnd = chance.and(chanceAnother);
        //then
        Assert.assertEquals(chanceAnd, new Chance(chanceAnother.getFraction() * chance.getFraction()));
    }

    @Test
    public void should_get_or_chance() {
        //given
        //when
        Chance chanceOr = chance.or(chanceAnother);
        //then
        Assert.assertEquals(chanceOr, new Chance(chance.getFraction() + chanceAnother.getFraction() -
                chance.getFraction() * chanceAnother.getFraction()));
    }
}
