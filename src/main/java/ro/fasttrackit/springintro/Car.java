package ro.fasttrackit.springintro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ro.fasttrackit.springintro.components.Engine;

@Slf4j
@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        log.info("Building a car");
    }

    public void drive() {
        log.info("Driving");
    }
}