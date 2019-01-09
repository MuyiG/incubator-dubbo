package org.apache.dubbo.demo;

import java.io.Serializable;

/**
 * <p>文件描述：</p>
 * <p>版权所有： 版权所有(C)2011-2099</p>
 * <p>公   司： 口袋购物</p>
 * <p>其他说明：</p>
 * <p>作   者：杨光</p>
 * <p>完成日期：2019/1/9</p>
 */
public class SubModel<T> extends BaseModel<T> implements Serializable {

    private static final long serialVersionUID = 2L;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
