package com.thoughtworks;

/**
 * FizzBuzz
 *
 * @author louwei
 * @date 2020/6/15
 */
public class FizzBuzz {

    public String say(int number) {
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;
        boolean isDividedBy7 = number % 7 == 0;
        boolean contain3 = String.valueOf(number).contains("3");
        StringBuilder result = new StringBuilder();
        if (!(isDividedBy3 || isDividedBy5 || isDividedBy7)) {
            return String.valueOf(number);
        }
        if (isDividedBy3 || contain3) {
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
