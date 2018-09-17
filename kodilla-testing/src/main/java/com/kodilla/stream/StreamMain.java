package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        // 2 Executor codeToExecute = () -> System.out.println("Say");
        //1 ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //* 3 */processor.execute(() -> System.out.println("Text example"));


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("TextSample", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("NextSampleText", String::toLowerCase));
        System.out.println(poemBeautifier.beautify("NextBorringText", String -> "New String Text"));
    }
}