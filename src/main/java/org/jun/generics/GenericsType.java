package org.jun.generics;

public class GenericsType<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public GenericsType(){
        super();
    }

    public GenericsType(T data) {
        this.data = data;
    }

}
