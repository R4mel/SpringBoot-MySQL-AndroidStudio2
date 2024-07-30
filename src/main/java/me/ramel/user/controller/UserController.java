package me.ramel.user.controller;

import lombok.RequiredArgsConstructor;
import me.ramel.user.model.user.User;
import me.ramel.user.model.user.UserDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserDao userDao;

    @GetMapping("/user/get-all") // 나중에 android에서 요청할 때
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    // android에서 새로운 정보를 입력받는다면
    @PostMapping("/user/save")
    public User save(@RequestBody User user) { // @RequestBody로 data 받아옴
        return userDao.save(user);
    }


}
