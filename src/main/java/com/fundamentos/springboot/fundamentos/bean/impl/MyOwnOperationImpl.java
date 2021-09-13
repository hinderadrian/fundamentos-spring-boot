package com.fundamentos.springboot.fundamentos.bean.impl;

import com.fundamentos.springboot.fundamentos.bean.MyOwnOperation;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyOwnOperationImpl implements MyOwnOperation {

    @Override
    public List<Integer> generateRandomElements(int maxElements, int maxLimit) {
        return new Random().ints(0, maxElements).limit(maxLimit).boxed().collect(Collectors.toList());
    }
}
