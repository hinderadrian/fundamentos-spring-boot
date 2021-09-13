package com.fundamentos.springboot.fundamentos.bean.impl;

import com.fundamentos.springboot.fundamentos.bean.MyOwnBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyOwnOperation;

import java.util.List;

public class MyOwnBeanWithDependencyImpl implements MyOwnBeanWithDependency {

    private MyOwnOperation myOwnOperation;

    public MyOwnBeanWithDependencyImpl(MyOwnOperation myOwnOperation) {
        this.myOwnOperation = myOwnOperation;
    }

    @Override
    public void displayElements() {
        System.out.println("Llamamos a MyOwnOperationImpl para generar lista aleatoria...");
        List<Integer> randomNumbers = myOwnOperation.generateRandomElements(500, 10);
        randomNumbers.forEach(System.out::println);
        System.out.println("Hola desde mi implementación de un bean con dependencia usando Streams y listas.");
    }
}
