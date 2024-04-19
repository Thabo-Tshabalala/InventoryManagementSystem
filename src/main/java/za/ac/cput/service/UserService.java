package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.User;
import za.ac.cput.repository.UserRepository;

import java.util.List;
@Service
public class UserService implements IUserService{

    UserRepository repository;
    @Autowired
    UserService(UserRepository repository){this.repository = repository;
    }
    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User read(String t) {
        return  repository.findById(t).orElse(null);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
