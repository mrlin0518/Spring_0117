package com.web.spring.study.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/beans/beans-config.xml");
//        HelloBean helloBean = (HelloBean)ctx.getBean("helloBean");
//        System.out.println(helloBean.getName());

//        HelloBean helloBean2 = ctx.getBean(HelloBean.class);
//        System.out.println(helloBean2.getName());

//        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("beans-config.xml");
//        HelloBean hellobean3 = ctx2.getBean(HelloBean.class);
//        System.out.println("---------------"+hellobean3.getName());
        
//        RoundBean roundBean = ctx.getBean(RoundBean.class);
//        System.out.println("PI :"+roundBean.getRundArea());
          Husband husband = ctx.getBean(Husband.class);
          System.out.println(husband);
    }

}
