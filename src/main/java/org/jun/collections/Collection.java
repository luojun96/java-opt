package org.jun.collections;

import java.util.*;
public class Collection {
    public void runCollectionDemo(){
        runSet();
        runList();
        runVector();
        runHashTable();
    }

    public static String getStr(){
        return "luo jun";
    }

    private void runSet() {
        System.out.println("--Set--");
        Set<Object> set = new HashSet<Object>();
        set.add("1");
        set.add("2");
        set.add("2");
        set.add(new Integer(1));
        set.add(new Integer(2));
        Iterator<Object> itt = set.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }
    }

    private void runList() {
        System.out.println("--List--");
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(1);
        list.add("1");
        Iterator<Object> itl = list.iterator();
        while (itl.hasNext()){
            System.out.println(itl.next());
        }
    }

    private void runVector() {
        System.out.println("--Vector--");
        Vector<Object> vector = new Vector<Object>();
        vector.add("a");
        vector.add("b");
        vector.add("b");
        Enumeration<Object> enumerate = vector.elements();
        while (enumerate.hasMoreElements()) {
            System.out.println(enumerate.nextElement());
        }
    }

    private void runHashTable() {
        System.out.println("--HashTable--");
        Hashtable<String,String> ht = new Hashtable<String,String>();
        ht.put("01","luo");
        ht.put("02","jun");
        System.out.println(ht.contains("jun"));
        Set<Map.Entry<String,String>> hSet = ht.entrySet();
        Iterator<Map.Entry<String,String>> it = hSet.iterator();
        Map.Entry<String,String> entry;
        while (it.hasNext()){
            entry = it.next();
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
    }
}
