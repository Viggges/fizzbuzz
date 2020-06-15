package com.thoughtworks;

/**
 * FizzBuzz
 *
 * @author louwei
 * @date 2020/6/15
 */
public class FizzBuzz {

    public String say(int i) {
        boolean isDividedBy3 = i % 3 == 0;
        boolean isDividedBy5 = i % 5 == 0;
        boolean isDividedBy7 = i % 7 == 0;
        if (isDividedBy3 && isDividedBy5) {
            return "FizzBuzz";
        }
        if (isDividedBy3) {
            return "Fizz";
        }
        if (isDividedBy5) {
            return "Buzz";
        }
        if(isDividedBy7){
            return "Whizz";
        }
        return String.valueOf(i);
    }
}
