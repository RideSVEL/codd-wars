package com.code.wars;

public class ExesAndOhs {

    public static boolean getXO(String str) {
        String[] split = str.toLowerCase().split("");
        int countX = 0, countO = 0;
        for (String s : split) {
            switch (s) {
                case "x" -> countX++;
                case "o" -> countO++;
            }
        }
        return countX == countO;
    }

    public static void main(String[] args) {
        System.out.println("xoxo");
        System.out.println("xooxxo");
        System.out.println("xxxo");
    }
}
