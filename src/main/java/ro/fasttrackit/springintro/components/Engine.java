package ro.fasttrackit.springintro.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Slf4j
@Component
public class Engine {

    @PostConstruct
    public void afterConstruct() {
        log.info("Constructed Engine");
    }

    public static void main(String[] args) {
    }
}
