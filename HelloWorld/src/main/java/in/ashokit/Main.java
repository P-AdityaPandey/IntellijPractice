package in.ashokit;

import in.ashokit.bean.HelloWorldClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Object obj = context.getBean("hw");
        HelloWorldClass hello = (HelloWorldClass) obj;

        hello.sayHello();


    }
}