package helloworld;

import helloworld.HelloWorldRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldRunnerTest {
    @Test
    void shouldRunHelloWorld() {
        HelloWorldRunner runner = new HelloWorldRunner();
        String result = runner.run();

        Assertions.assertEquals("Hello world!", result);
    }
}