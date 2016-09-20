package crg.kata05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void setUp() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void saysHello() {
        assertThat(helloWorld.greeting()).isEqualTo("Hello, World!");
    }

}
