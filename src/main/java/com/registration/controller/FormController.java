package com.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.model.FormEntity;
import com.registration.service.FormService;
import com.registration.service.FormServiceimpl;

@RestController
@RequestMapping("/form")
@CrossOrigin("*")
public class FormController {
	
  @Autowired
  private FormService formService;
  
  @PostMapping("/registration")
  public FormEntity saveData(@RequestBody FormEntity formEntity) {
	return formService.save(formEntity);
	  
  }
  
  @GetMapping("/registredData")
  public List<FormEntity> listOfRegistred(){
	return formService.findAll();
	  
  }
}
