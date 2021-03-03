package com.code.wars;

public class CamelCase {

    public static String toCamelCase(String s) {
        String[] split = s.split("[_-]");
        StringBuilder sb = new StringBuilder(split[0]);
        for (int i = 1; i < split.length; i++) {
            int lengthBeforeAdding = sb.length();
            sb.append(split[i]);
            sb.setCharAt(lengthBeforeAdding, String.valueOf(sb.charAt(lengthBeforeAdding)).toUpperCase().toCharArray()[0]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "the_stealth_warrior";
        System.out.println("input: " + input);
        System.out.println(toCamelCase(input));
    }
}
