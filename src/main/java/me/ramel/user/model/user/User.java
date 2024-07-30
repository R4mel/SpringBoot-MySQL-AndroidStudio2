package me.ramel.user.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // 여기서는 increasing key로 primary key를 자동생성해주지만, 나는 id를 primary key로 생성해줬기 때문에 필요없다
    private String id; // 이게 id
    private String password;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}