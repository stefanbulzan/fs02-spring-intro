package ro.fasttrackit.springintro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntroApplication.class, args);
    }

    @Bean
    SomeBean firstBean() {
        return new SomeBean("my bean");
    }

    @Bean
    SomeBean secondBean() {
        return new SomeBean("second bean");
    }

    @Bean
    CommandLineRunner atStartup(SomeBean secondBean, ApplicationContext context) {
        return args -> {
            System.out.println("at startup " + secondBean.name());
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        };
    }
}

record SomeBean(String name) {
}
