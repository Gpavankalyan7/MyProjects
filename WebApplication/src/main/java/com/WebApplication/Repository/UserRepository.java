package com.WebApplication.Repository;

import org.springframework.data.repository.CrudRepository;

import com.WebApplication.Model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	

}
