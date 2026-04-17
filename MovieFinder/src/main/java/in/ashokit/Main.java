package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ashokit.bean.MovieListener;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MovieListener ml = (MovieListener) context.getBean("listener");
        ml.fetchMovies(2025);
    }
}