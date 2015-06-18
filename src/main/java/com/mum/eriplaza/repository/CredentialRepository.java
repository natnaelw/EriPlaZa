package com.mum.eriplaza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.Credentials;

@Repository
public interface CredentialRepository extends CrudRepository<Credentials, String> {

}
