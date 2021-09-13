package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import com.fundamentos.springboot.fundamentos.bean.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean myBeanOperation() {
        return new MyBeanTwoImpl();
    }

    @Bean
    public MyOperation myOperationOperation() {
        return new MyOperationImpl();
    }

    @Bean
    public MyBeanWithDependency beanOperationImplWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImpl(myOperation);
    }

    @Bean
    public MyOwnOperation beanMyOwnOperation() {
        return new MyOwnOperationImpl();
    }

    @Bean
    public MyOwnBeanWithDependency beanMyOwnBeanWithDependency(MyOwnOperation myOwnOperation) {
        return new MyOwnBeanWithDependencyImpl(myOwnOperation);
    }
}
