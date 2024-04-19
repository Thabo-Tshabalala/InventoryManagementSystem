package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class User {
@Id
    protected String userID;
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected boolean role;



    public User(){}
    public User(Builder builder){
        this.userID = builder.userID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;

    }
    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return role == user.role && Objects.equals(userID, user.userID) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, name, surname, email, password, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }

    public static class Builder{
        private String userID;
        private String name;
        private String surname;
        private String email;
        private String password;
        private boolean role;

        public Builder setUserID(String userID) {
            this.userID = userID;
            return  this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return  this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(boolean role) {
            this.role = role;
            return this;
        }

        public Builder copy(User user){
            this.userID = user.userID;
            this.name = user.name;
            this.surname = user.surname;
            this.email = user.email;
            this.password = user.password;
            this.role = user.role;
            return this;
        }
        public User build(){return  new User(this);
        }
    }
}
