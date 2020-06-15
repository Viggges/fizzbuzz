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
//        if (isDividedBy3 && isDividedBy5 && isDividedBy7) {
//            return "FizzBuzzWhizz";
//        }
//        if (isDividedBy3 && isDividedBy7) {
//            return "FizzWhizz";
//        }
//        if (isDividedBy3 && isDividedBy5) {
//            return "FizzBuzz";
//        }
//
//        if (isDividedBy3) {
//            return "Fizz";
//        }
//        if (isDividedBy5) {
//            return "Buzz";
//        }
//        if (isDividedBy7) {
//            return "Whizz";
//        }
//        return String.valueOf(i);
        StringBuilder result = new StringBuilder();
        if(!(isDividedBy3||isDividedBy5||isDividedBy7)){
            return String.valueOf(i);
        }
        if (isDividedBy3) {
            result.append("Fizz");
        }
        if (isDividedBy5) {
            result.append("Buzz");
        }
        if (isDividedBy7) {
            result.append("Whizz");
        }
        return result.toString();
    }

}
