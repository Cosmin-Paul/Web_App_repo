package com.itschool.project.exceptions;

public class StringException {

    public static void main(String[] args) {
        String input = "Say Hello";
        int validIndex = 2;
        int invalidIndex = 28;

        printCharAt(input, invalidIndex);
    }

    private static void printCharAt(String input, int index) {
        try {
            System.out.println("Character at index: " + index + " : " + input.charAt(index));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("String index out of bound: " + exception.getMessage());
        }
    }
}
