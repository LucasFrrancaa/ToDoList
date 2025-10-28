package br.com.lucasfranca.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasfranca.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
