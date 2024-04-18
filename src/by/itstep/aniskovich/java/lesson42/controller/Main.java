package by.itstep.aniskovich.java.lesson42.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    // https://logging.apache.org/
    // https://logging.apache.org/log4j/1.x/

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.INFO);

        Scanner scanner = new Scanner("10");
        int number = scanner.nextInt();

        long result = findFactorial(number);
        String s = String.format("%d! = %d", number, result);

        LOGGER.info(s);

//        LOGGER.trace("call trace method...");
//        LOGGER.debug("call debug method...");
//        LOGGER.info("call info method...");
//        LOGGER.warn("call warn method...");
//        LOGGER.error("call error method...");
//        LOGGER.fatal("call fatal method...");
    }

    public static long findFactorial(int number) {
        LOGGER.debug("Input number is " + number);

        long result = 1;

        LOGGER.debug("Start: result = " + result);


        for (int i = 2; i <= number; i++) {
            result *= i;
            LOGGER.trace(String.format("i =  %d, result = %d", i, result));
        }

        LOGGER.debug("Return result number is " + result);
        return result;
    }
}
