package org.jun.Lambda;

import java.util.*;

public class Lambda {
    public void run(){
        List<String> names = Arrays.asList("03", "jun", "01", "lin");
        Collections.sort(names, (String a, String b) -> {return b.compareTo(a);} );
        Iterator<String> itl = names.iterator();
        while (itl.hasNext()){
            System.out.println(itl.next());
        }
    }
}
