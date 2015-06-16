package com.mum.eriplaza.repository;

import org.springframework.data.repository.CrudRepository;

import com.mum.eriplaza.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
