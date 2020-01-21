package io.avinash.restdemo.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.avinash.restdemo.todo.model.ToDo;

@Service
public class TodoServices {

	public static long counter = 0;

	public static List<ToDo> availableTodos = new ArrayList<ToDo>();

	static {
		availableTodos.add(new ToDo(1, "admin", "Learn Guitar", new Date(), false));
		availableTodos.add(new ToDo(2, "admin", "Learn FSD", new Date(), false));
		availableTodos.add(new ToDo(3, "admin", "Learn Swimming", new Date(), false));
		availableTodos.add(new ToDo(4, "admin", "Learn Running", new Date(), false));
	}

	public List<ToDo> getAllTodos() {
		return availableTodos;
	}
}
