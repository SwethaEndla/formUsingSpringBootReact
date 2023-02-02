package com.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.model.FormEntity;
import com.registration.repository.FormRepo;

@Service
public class FormServiceimpl implements FormService{
	
	@Autowired
	private FormRepo formRepo;

	@Override
	public FormEntity save(FormEntity formEntity) {
 		return formRepo.save(formEntity);
	}

	@Override
	public List<FormEntity> findAll() {
		return formRepo.findAll();
	}

	
}
