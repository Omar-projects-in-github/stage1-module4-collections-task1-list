package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        for (int i = 0; i < sourceList.size() - 1; i++) {
            for (int j = i + 1; j < sourceList.size(); j++) {
                int number = comparator.compare(sourceList.get(i), sourceList.get(j));
                if (number > 0) {
                    String temporary = sourceList.get(i);
                    sourceList.set(i, sourceList.get(j));
                    sourceList.set(j, temporary);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int number1 = Integer.parseInt(a);
        int number2 = Integer.parseInt(b);

        int function1 = 5 * (int)Math.pow(number1, 2) + 3;
        int function2 = 5 * (int)Math.pow(number2, 2) + 3;
        if (function1 > function2)
            return 1;
        else if (function1 < function2)
            return -1;
        return 0;
    }
}
