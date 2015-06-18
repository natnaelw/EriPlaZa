package com.mum.eriplaza.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mum.eriplaza.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	/*@Query("SELECT user FROM User u  INNER JOIN u.items item WHERE u.id= :id")
    public User getUserById(@Param(value = "id")Long id);
	*/
	
	

}
