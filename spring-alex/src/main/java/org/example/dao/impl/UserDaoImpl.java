package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	public void print(){
		System.out.println("print UserDao");
	}
}
