package example.sometest;

import org.junit.jupiter.api.BeforeEach;


public class TestBase {
    @BeforeEach
    void beforeEachTest() {
        System.out.println("test started");
    }
}
