package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);

        //then
        assertThat(result,is("1"));
    }
    @Test
    public void should_return_fizz_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);

        //then
        assertThat(result,is("Fizz"));
    }
    @Test
    public void should_return_buzz_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);

        //then
        assertThat(result,is("Buzz"));
    }
    @Test
    public void should_return_fizzBuzz_given_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(15);

        //then
        assertThat(result,is("FizzBuzz"));
    }
    @Test
    public void should_return_whizz_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(7);

        //then
        assertThat(result,is("Whizz"));
    }
    @Test
    public void should_return_fizzWhizz_given_21() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(21);

        //then
        assertThat(result,is("FizzWhizz"));
    }
    @Test
    public void should_return_fizzBuzzWhizz_given_105() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(105);

        //then
        assertThat(result,is("FizzBuzzWhizz"));
    }
    @Test
    public void should_return_fizz_given_13() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(13);

        //then
        assertThat(result,is("Fizz"));
    }
    @Test
    public void should_return_fizz_given_30() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(30);

        //then
        assertThat(result,is("Fizz"));
    }
}
