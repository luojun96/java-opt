package org.jun.generics;

import java.util.Arrays;

/*
	？ 表示不确定的java类型。
	T  表示java类型。
	K V 分别代表java键值中的Key Value。
	E 代表Element。
 */

public class GenericsOperator {
    public void run(){
        GenericsType<Integer> gt = new GenericsType<Integer>(100);
        System.out.println(gt.getData());

        GenericsType<String[]> gtl = new GenericsType<String[]>(new String[]{"jun","luo"});
        Arrays.asList(gtl.getData()).forEach(System.out::println);

        GenericsKeyValue<String,Integer> gkv = new GenericsKeyValue<String, Integer>("001", 100);
        System.out.println(gkv.getKey()+":"+gkv.getValue());

        System.out.println(getType().getData());
    }

    private GenericsType<?> getType(){
        return new GenericsType<Float>(1.23f);
    }


}
