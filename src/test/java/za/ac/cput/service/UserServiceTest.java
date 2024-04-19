package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class UserServiceTest {
@Autowired
   private  UserService userService;

private static User user1;

@Test
void a_setup(){
    user1 = UserFactory.buildUser("221715126","Thabo","Tshabalala","User@gmaill.cm","Yes",true);
}
    @Test
    void b_create() {
        User created = userService.create(user1);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void c_read() {
User id = new User(user1.getUserID(),user1.getName(),user1.getSurname(), user1.getEmail(),user1.getPassword(),user1.isRole());


    }

    @Test
    void d_update() {
    }

    @Test
    void e_getAll() {
    }
}