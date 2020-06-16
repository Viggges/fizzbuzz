package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

//    public void should_return_xxx_give_xxxx(){
//        MarsRover marsRover = new MarsRover();
//        marsRover.initPosition(3, 4, "E");
//        marsRover.initSafeZone(5,5);
//        //when
//        String result = marsRover.execute("MMLLMMRRMM");
//
//        //then
//        assertThat(result, is("(5,4)E"));
//    }
    @Test
    public void should_return_54E_given_MMLLMMRRMM() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(3, 4, "E");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("MMLLMMRRMM");

        //then
        assertThat(result, is("(5,4)E"));
    }

    @Test
    public void should_return_74E_given_MMLLMMRRMMMM() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(3, 4, "E");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("MMLLMMRRMMMM");

        //then
        assertThat(result, is("(5,4)E"));
    }

    @Test
    public void should_return_no14W_given_MMLLMMMMMM() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(3, 4, "E");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("MMLLMMMMMM");

        //then
        assertThat(result, is("(-1,4)W"));
    }

    @Test
    public void should_return_01n_when00n_given_m() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "N");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("M");

        //then
        assertThat(result, is("(0,1)N"));
    }

    @Test
    public void should_return_00w_when00n_given_l() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "N");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("L");

        //then
        assertThat(result, is("(0,0)W"));
    }

    @Test
    public void should_return_00e_when00n_given_r() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "N");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("R");

        //then
        assertThat(result, is("(0,0)E"));
    }

    @Test
    public void should_return_0no1s_when00s_given_m() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "S");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("M");

        //then
        assertThat(result, is("(0,-1)S"));
    }

    @Test
    public void should_return_00e_when00s_given_l() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "S");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("L");

        //then
        assertThat(result, is("(0,0)E"));
    }

    @Test
    public void should_return_00w_when00s_given_r() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "S");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("R");

        //then
        assertThat(result, is("(0,0)W"));
    }

    @Test
    public void should_return_10e_when00e_given_m() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "E");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("M");

        //then
        assertThat(result, is("(1,0)E"));
    }

    @Test
    public void should_return_00n_when00e_given_l() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "E");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("L");

        //then
        assertThat(result, is("(0,0)N"));
    }

    @Test
    public void should_return_00s_when00e_given_r() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "E");
        //when
        String result = marsRover.execute("R");

        //then
        assertThat(result, is("(0,0)S"));
    }

    @Test
    public void should_return_no10w_when00w_given_m() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "W");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("M");

        //then
        assertThat(result, is("(-1,0)W"));
    }

    @Test
    public void should_return_00s_when00w_given_l() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "W");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("L");

        //then
        assertThat(result, is("(0,0)S"));
    }

    @Test
    public void should_return_00n_when00w_given_r() {
        //given
        MarsRover marsRover = new MarsRover();
        marsRover.initPosition(0, 0, "W");
        marsRover.initSafeZone(5,5);
        //when
        String result = marsRover.execute("R");

        //then
        assertThat(result, is("(0,0)N"));
    }

}
