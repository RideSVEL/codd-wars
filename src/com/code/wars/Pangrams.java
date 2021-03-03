package com.code.wars;

public class Pangrams {

    public static boolean isPangram(String sentence) {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean[] confirms = new boolean[alphabet.length];
        for (char ch : sentence.toLowerCase().toCharArray()) {
            for (int i = 0; i < alphabet.length; i++) {
                if (ch == alphabet[i]) {
                    confirms[i] = true;
                    break;
                }
            }
        }
        for (boolean confirm : confirms) {
            if (!confirm) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains(String.valueOf(c)))
                return false;
        return true;
    }

    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(isPangram(pangram1));
        System.out.println(check(pangram1));
    }
}
