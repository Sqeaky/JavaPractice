import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test Boilerplate that can be copied")
public class SampleTests {

    @Test
    @DisplayName("Name for tests")
    void exampleTest() {
        System.out.println("In SampleTests#exampleTest");
        assertTrue(true);
    }
}
