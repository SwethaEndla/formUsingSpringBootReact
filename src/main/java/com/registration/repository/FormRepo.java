package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.model.FormEntity;

@Repository
public interface FormRepo extends JpaRepository<FormEntity, Long>{

}
