package org.jun.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMap {

    public static void run() {
        Map<String, Employee> staff = new LinkedHashMap<>();
        staff.put("144-25-5678", new Employee("luojun"));
        staff.put("144-25-5679", new Employee("luojun01"));
        staff.put("144-25-5689", new Employee("luojun02"));
        staff.put("144-25-5699", new Employee("luojun03"));

        Iterator<String> iteratorKey = staff.keySet().iterator();
        while (iteratorKey.hasNext())
            System.out.println(iteratorKey.next());

//        Iterator<Employee> iteratorValue = staff.values().iterator();
//        while (iteratorValue.hasNext())
//            System.out.println(iteratorValue);
    }
}
