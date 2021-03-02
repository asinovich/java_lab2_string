import static org.junit.jupiter.api.Assertions.*;

class Action_on_string_Test {
    String str1 = "Hello, ";
    String str2 = "World!";

    @org.junit.jupiter.api.Test
    void low() {
        assertEquals("hello, ", Action_on_string.low(str1));
    }

    @org.junit.jupiter.api.Test
    void up() {
        assertEquals("WORLD!", Action_on_string.up(str2));
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals( 6, Action_on_string.size(str2));
    }

    @org.junit.jupiter.api.Test
    void unite() {
        assertEquals("Hello, World!", Action_on_string.unite(str1, str2));
    }
}