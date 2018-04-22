package com.todo.app.repository;

import com.todo.app.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
*
* Created by Vinoth on 22/04/2018.
*/
@RepositoryRestResource
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
