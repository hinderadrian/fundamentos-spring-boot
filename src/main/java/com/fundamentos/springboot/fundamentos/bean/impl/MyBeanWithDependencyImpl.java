package com.fundamentos.springboot.fundamentos.bean.impl;

import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency {

    MyOperation myOperation;

    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int number = 22;
        System.out.println(myOperation.sum(number));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
