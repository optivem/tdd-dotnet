import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldRunnerTest {
    @Test
    public void shouldRunHelloWorld() {
        HelloWorldRunner runner = new HelloWorldRunner();
        String result = runner.run();

        Assertions.assertEquals("Hello world!", result);
    }
}