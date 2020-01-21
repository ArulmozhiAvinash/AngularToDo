package io.avinash.restdemo.todo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.avinash.restdemo.todo.model.ToDo;
import io.avinash.restdemo.todo.service.TodoServices;

@RestController
public class ToDoResources {

	@Autowired
	TodoServices todoService;

	@GetMapping(path = "/users/{name}/todos")
	public List<ToDo> getAllTodos(@PathVariable String name) {

		return todoService.getAllTodos();
	}
}
