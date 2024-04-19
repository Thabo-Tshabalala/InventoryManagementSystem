package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class UserFactoryTest {

    @Test
    void a_buildUser() {
User user1 = UserFactory.buildUser("221715126","Thabo","Tshabalala","just@21","Yes",true);
assertNotNull(user1);
System.out.println(user1.toString());
    }

    @Test
    void b_buildUserFail (){
        User user1 = UserFactory.buildUser("","","","","",true);
        assertNotNull(user1);
        System.out.println(user1.toString());
    }


}