package crg.kata05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DictionaryTest {

    private Dictionary dictionary;

    @Before
    public void setUp() {
        dictionary = new Dictionary();
    }
    
    @Test
    public void determinesWordIsContainedWithin() {
        assertThat(dictionary.contains("Apple")).isTrue();
    }


}
