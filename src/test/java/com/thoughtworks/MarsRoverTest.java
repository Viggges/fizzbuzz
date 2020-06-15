package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    @Test
    public void should_return_54E_given_MMLLMMRRMM() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.init(3,4,"E");
        //when
        String result = marsRover.execute("MMLLMMRRMM");

        //then
        assertThat(result,is("(5,4)E"));
    }
    @Test
    public void should_return_74E_given_MMLLMMRRMMMM() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.init(3,4,"E");
        //when
        String result = marsRover.execute("MMLLMMRRMMMM");

        //then
        assertThat(result,is("(7,4)E"));
    }
    @Test
    public void should_return_no14W_given_MMLLMMMMMM() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.init(3,4,"E");
        //when
        String result = marsRover.execute("MMLLMMMMMM");

        //then
        assertThat(result,is("(-1,4)W"));
    }
}
