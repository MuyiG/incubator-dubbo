package org.apache.dubbo.demo;

import java.io.Serializable;

public class BaseModel<T> implements Serializable {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
