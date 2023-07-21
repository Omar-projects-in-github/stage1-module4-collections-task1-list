package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> updatedList = new LinkedList<>();

        Iterator<Integer> iterator = sourceList.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1)
                updatedList.addFirst(number);
            else
                updatedList.addLast(number);
        }

        return updatedList;
    }
}
