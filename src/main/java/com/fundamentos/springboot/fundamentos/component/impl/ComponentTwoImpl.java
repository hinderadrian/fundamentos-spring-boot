package com.fundamentos.springboot.fundamentos.component.impl;

import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImpl implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente dos.");
    }
}
