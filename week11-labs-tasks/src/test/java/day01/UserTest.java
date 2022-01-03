package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user1 = new NormalUser("example1@gmail.com", "pw123");
    User user2 = new AdminUser("example2@gmail.com", "pw45678");

    @Test
    void testGetUserEmail() {
        assertEquals("example1@gmail.com", user1.getUserEmail());
        assertEquals("example2@gmail.com", user2.getUserEmail());
    }

    @Test
    void testGetPassword() {
        assertEquals("pw123", user1.getPassword());
        assertEquals("*******", user2.getPassword());
    }
}
