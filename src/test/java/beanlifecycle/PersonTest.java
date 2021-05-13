package beanlifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void testPersonBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = (Person) context.getBean("person");
        assertEquals("dummy person", person.getName());
        context.registerShutdownHook();
    }
}
