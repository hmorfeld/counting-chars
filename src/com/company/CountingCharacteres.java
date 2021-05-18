package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacteres {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        //String testString = "This is a test string";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to count characters!");
        String userInput = input.nextLine();
        char[] charactersInString = userInput.toCharArray();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)){
                characterCounts.put(character,characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character,1);
            }
        }

        for (Map.Entry<Character, Integer> oneChar: characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
