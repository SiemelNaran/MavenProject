package example.sometest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


// https://stackoverflow.com/questions/64799339/how-to-use-junit5-extendwith-with-modules-when-werror-is-present
@ExtendWith(NoopTestWatcher.class)
public class AdderTest {
    @Test
    void test() {
        assertEquals(5, Adder.add(2, 3));
    }

}
