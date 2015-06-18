package com.mum.eriplaza.services;

import java.util.List;

import com.mum.eriplaza.domain.Credentials;


 
public interface CredentialsService {

	public void save(Credentials credentials);
	public List<Credentials> findAll();
 }
