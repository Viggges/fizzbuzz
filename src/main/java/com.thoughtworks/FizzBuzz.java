package com.thoughtworks;

/**
 * FizzBuzz
 *
 * @author louwei
 * @date 2020/6/15
 */
public class FizzBuzz {

    public String say(int number) {
        boolean contain3 = String.valueOf(number).contains("3");
        StringBuilder result = new StringBuilder();

        if (contain3) {
            return "Fizz";
        }

        if (isDividedByDivisor(number, 3)) {
            result.append("Fizz");
        }
        if (isDividedByDivisor(number, 5)) {
            result.append("Buzz");
        }
        if (isDividedByDivisor(number, 7)) {
            result.append("Whizz");
        }

        if ("".equals(result.toString())) {
            return String.valueOf(number);
        }

        return result.toString();
    }

    private boolean isDividedByDivisor(int number, int divisor) {
        return number % divisor == 0;
    }
}
