package com.code.wars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            integers.add(Integer.parseInt(Character.toString(sb.charAt(i))));
        }
        Collections.sort(integers);
        StringBuilder result = new StringBuilder();
        for (int i = integers.size() - 1; i >= 0; i--) {
            result.append(integers.get(i));
        }
        return Integer.parseInt(result.toString());
    }

    public static int sortDesc2(final int num) { // not my
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(1501484));
        System.out.println(sortDesc2(1501484));
    }
}
