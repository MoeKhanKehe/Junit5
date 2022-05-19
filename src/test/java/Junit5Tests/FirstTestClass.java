package Junit5Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {

    @Test
    void firstMethod() {
        System.out.println("This is the first test method!");
    }

    @Test
    @DisplayName("US-1234: TC12 - this method is the second one")
    void secondMethod() {
        System.out.println("This is the second test method!");
    }
}
