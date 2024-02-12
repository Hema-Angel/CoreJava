package streamsprogramming;

import java.util.Arrays;

public class StringContainsVowels_2 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "grape"};

        Arrays.stream(strings)
                .filter(s -> s.chars().anyMatch(c -> "aeiouAEIOU".indexOf(c) != -1))
                .forEach(s -> System.out.println(s + " - " + s.replaceAll("[^aeiouAEIOU]", "").length() + " vowels"));
    }
}
