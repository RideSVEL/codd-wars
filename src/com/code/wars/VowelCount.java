package com.code.wars;

public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] split = str.split("");
        String[] chs = new String[]{"a", "e", "i", "o", "u"};
        for (String s : split) {
            for (String ch : chs) {
                if (s.equals(ch)) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }
}
