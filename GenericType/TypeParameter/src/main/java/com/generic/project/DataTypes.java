package com.generic.project;

import javax.xml.crypto.Data;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TypeParameter}
 * @Date: {2022/03/12 && 4:32 PM}
 */
public class DataTypes <T> {

    T data;

    public DataTypes(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public T getObject() {
        return this.data;
    }



    public static void main(String[] args) {
        DataTypes<Integer > dataTypes = new DataTypes<>(3);
        System.out.println(dataTypes);
    }
}
