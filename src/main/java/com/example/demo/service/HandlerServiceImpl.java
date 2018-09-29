package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HandlerDao;

@Service
public class HandlerServiceImpl implements HandlerService {

	@Autowired
	private HandlerDao handlerDao;
	
	@Override
	public void getById(String orderId) {

		handlerDao.getById(orderId);
	}

}
