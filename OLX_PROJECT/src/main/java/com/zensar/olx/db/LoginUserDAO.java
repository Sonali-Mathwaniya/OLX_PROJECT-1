package com.zensar.olx.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olx.bean.LoginUser;


@Repository
public interface LoginUserDAO extends JpaRepository<LoginUser, Integer>{

	LoginUser findByName(String name);
	
}
