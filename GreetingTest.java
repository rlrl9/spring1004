package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("exam1.xml");
        Greeting ob1 = factory.getBean("morning", Greeting.class);
        Greeting ob2 = factory.getBean("afternoon", Greeting.class);
        Greeting ob3 = factory.getBean("evening", Greeting.class);
        Greeting ob4 = factory.getBean("night", Greeting.class);
        Date t = factory.getBean("local0", Date.class);
        if(t.getHours()>=6&&t.getHours()<12){
            ob1.greet();
        }
        else if(t.getHours()>=12&&t.getHours()<17){
            ob2.greet();
        }
        else if(t.getHours()>=17&&t.getHours()<22){
            ob3.greet();
        }
        else{
            ob4.greet();
        }
    }

}
