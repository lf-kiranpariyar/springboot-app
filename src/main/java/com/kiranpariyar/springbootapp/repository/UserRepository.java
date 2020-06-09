package com.kiranpariyar.springbootapp.repository;

import com.kiranpariyar.springbootapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
