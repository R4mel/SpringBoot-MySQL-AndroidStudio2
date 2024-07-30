package me.ramel.user.model.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDao { // auto-writing / Data Access Object

    private final UserRepository repository;


    public User save(User user) {
        return repository.save(user); // repository 함수가 다 자동으로 해줌
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll()).
                forEach(users::add);

        return users;
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public void deleyeByid(String id) {
        repository.deleteById(id);
    }
}