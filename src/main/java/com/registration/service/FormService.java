package com.registration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.registration.model.FormEntity;


public interface FormService {

	public FormEntity save(FormEntity formEntity);
	
	public List<FormEntity> findAll();
		
	
}
