package org.jun.generics;

public class GenericsKeyValue<K,V> {
    private K key;
    private V value;

    public K getKey(){
        return key;
    }

    public void seKey(K key){
        this.key = key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public GenericsKeyValue(){
        super();
    }

    public GenericsKeyValue(K key, V value){
        this.key = key;
        this.value = value;
    }


}

