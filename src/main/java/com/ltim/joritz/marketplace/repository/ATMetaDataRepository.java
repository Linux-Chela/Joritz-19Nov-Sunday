package com.ltim.joritz.marketplace.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltim.joritz.marketplace.model.ATMetaDataModel;

@Repository
public interface ATMetaDataRepository extends JpaRepository<ATMetaDataModel, Integer>{

	
	

}
