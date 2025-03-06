package com.murali.app.repository;

import com.murali.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User, Integer>{
}
