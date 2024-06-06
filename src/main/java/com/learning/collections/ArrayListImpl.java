package com.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("Smith");
        list.add(true);
        list.add(234.23);
        System.out.println(list);

        List<String> namelist = new ArrayList<>();
        namelist.add("John");
        namelist.add("SMith");
        namelist.add("Anne");
        System.out.println(namelist);
    }
}
