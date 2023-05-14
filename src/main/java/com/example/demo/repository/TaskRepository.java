package com.example.demo.repository;

import com.example.demo.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TaskRepository extends CrudRepository<TaskEntity, Integer> {

}
