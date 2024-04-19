package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.util.logging.Handler;

public class UserFactory {

public static User buildUser(String userID, String name,String surname, String email, String password, boolean role){
    if(Helper.isNullorEmpty(userID) || Helper.isNullorEmpty(name) || Helper.isNullorEmpty(surname)
    ||Helper.isNullorEmpty(email)||Helper.isNullorEmpty(password)||Helper.isNullorEmpty(String.valueOf(role)))
        return  null;

    return new User.Builder().setUserID(userID).setName(name).setSurname(surname).setEmail(email).setPassword(password).setRole(role).build();


}

}
