package beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person person() {
        var person = new Person();
        person.setName("dummy person");
        return person;
    }
}
