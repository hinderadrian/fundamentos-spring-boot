package com.fundamentos.springboot.fundamentos.bean.impl;

import com.fundamentos.springboot.fundamentos.bean.MyBean;

public class MyBeanImpl implements MyBean {
    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del bean.");
    }
}
