package com.thoughtworks;

/**
 * FizzBuzz
 *
 * @author louwei
 * @date 2020/6/15
 */
public class FizzBuzz {
    public void fizzBuzz(int number) {
        for (int i = 0; i < number; i++) {
            String result = say(i + 1);
            System.out.println(result);
        }
    }

    public String say(int number) {
        StringBuilder result = new StringBuilder();

        if (isContains(number, "3") && !isContains(number, "5")) {
            return "Fizz";
        }

        if ((isDividedByDivisor(number, 3) && isContains(number, "7")) || (isDividedByDivisor(number, 3) && !isContains(number, "5"))) {
            result.append("Fizz");
        }
        if (isDividedByDivisor(number, 5) && !isContains(number, "7")) {
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

    private boolean isContains(int number, String containor) {
        return String.valueOf(number).contains(containor);
    }

    private boolean isDividedByDivisor(int number, int divisor) {
        return number % divisor == 0;
    }
}
