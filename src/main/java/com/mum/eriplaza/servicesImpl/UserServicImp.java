package com.mum.eriplaza.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.eriplaza.domain.User;
import com.mum.eriplaza.repository.UserRepository;
import com.mum.eriplaza.services.UserService;
@Service
public class UserServicImp implements UserService {
	@Autowired
    private  UserRepository urr;
	@Override
	public void getUser(User user) {
		// TODO Auto-generated method stub
		urr.findOne(user.getId());
		
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		urr.save(user);
	}
  
}