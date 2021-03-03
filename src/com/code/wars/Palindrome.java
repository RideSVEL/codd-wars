package com.code.wars;

public class Palindrome {

    public static boolean isPalindrome(final int num) {
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()) == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(404));
        System.out.println(isPalindrome(505));
        System.out.println(isPalindrome(5050));
        System.out.println(isPalindrome(5005));
        System.out.println(isPalindrome(1111));
        System.out.println(isPalindrome(966696));
    }
}
