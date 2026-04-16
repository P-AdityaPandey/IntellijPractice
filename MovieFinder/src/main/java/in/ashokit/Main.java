package in.ashokit;

import in.ashokit.bean.MovieListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MovieListener ml = (MovieListener) context.getBean("listener");
        ml.fetchMovies(2022);


    }
}