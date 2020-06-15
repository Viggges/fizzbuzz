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
        if(contain3){
            return "Fizz";
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
        if("".equals(result.toString())){
            return String.valueOf(number);
        }

        return result.toString();
    }
}
