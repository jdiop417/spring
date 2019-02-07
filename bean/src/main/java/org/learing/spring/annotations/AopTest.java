package org.learing.spring.annotations;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Person person = (Person) context.getBean("person");
        person.setName("xiaohong");
        System.out.println(person.getName());


    }
}
