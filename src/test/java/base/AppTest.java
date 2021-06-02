package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void Test1() {
        App myApp = new App();
        String name = "Homer";

        String expectedOutput = "Homer has 5 characters.";

        Assertions.assertEquals(expectedOutput, myApp.WriteLength(name));
    }
}
