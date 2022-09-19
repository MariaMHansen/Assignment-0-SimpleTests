import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assignment1TasksTest {
    Assignment1TasksTest() {
    }

    @DisplayName("checks if sayHello method returns String hello world")
    @Test
    void Should_ReturnHelloWorld() {
        Assertions.assertEquals("hello world!", Assignment1Tasks.sayHello());
    }

    @DisplayName("countDogs no dogs in string")
    @Test
    void Should_ReturnZero_When_NoDogInString() {
        int count = Assignment1Tasks.countDogs("cat cat catcat");
        Assertions.assertEquals(0, count);
    }
}