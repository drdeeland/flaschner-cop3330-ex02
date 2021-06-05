/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void output_string_uses_string_name_and_displays_string_length() {
        App myApp = new App();
        String name = "Homer";

        String expectedOutput = "Homer has 5 characters.";

        Assertions.assertEquals(expectedOutput, myApp.WriteLength(name));
    }
}
