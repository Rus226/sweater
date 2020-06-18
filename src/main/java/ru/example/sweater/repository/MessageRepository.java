package ru.example.sweater.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.sweater.entity.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByTagContaining(String tag);
}
