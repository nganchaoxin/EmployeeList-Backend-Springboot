package com.example.demo.controller;

import com.example.demo.entity.TaskEntity;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    TaskRepository taskRepository;
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public Object showAllTask() {
       return "Hello Spring Boot";
    }
}
