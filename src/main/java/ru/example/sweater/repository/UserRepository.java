package ru.example.sweater.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.sweater.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
