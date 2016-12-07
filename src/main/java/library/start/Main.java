package library.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        JobExecuter jobExecuter = applicationContext.getBean("jobExecuter", JobExecuter.class);
        System.out.println("Hello user! Please choose one of command by using wite space as splitter: add, delete, edit, all:");
        jobExecuter.run();
        System.out.println("BYE BYE!");
    }
}
