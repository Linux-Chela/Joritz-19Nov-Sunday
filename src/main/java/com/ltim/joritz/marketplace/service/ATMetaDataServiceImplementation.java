package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ATMetaDataModel;
import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.repository.ATMetaDataRepository;
import com.ltim.joritz.marketplace.repository.ATMetaDataSchemaRepository;
import com.ltim.joritz.marketplace.repository.ArtifactRepository;


@Service
public class ATMetaDataServiceImplementation implements ATMetaDataService {
	
	@Autowired
	private ATMetaDataRepository atMetaDataRepository;
	@Autowired
	private ATMetaDataSchemaRepository atMetaDataSchemaRepository;
	@Autowired
	private ArtifactRepository artifactRepository;
	
	@Override
	public ATMetaDataModel createATMetaData(ATMetaDataModel atMetaData) {
		int atMetaDataSchemaId = atMetaData.getAtMetaDataSchemaModel().getAtMDSchemaId();
		int artifactId = atMetaData.getArtifact().getArtifactid();
		
		Optional<ATMetaDataSchemaModel> existingSchema = atMetaDataSchemaRepository.findById(atMetaDataSchemaId);
		Optional<ArtifactModel> existingArtifact = artifactRepository.findById(artifactId);
		if (existingSchema.isPresent()) {
			
            // If exists, set the ATMetaDataSchema and save ATMetaData
            atMetaData.setAtMetaDataSchemaModel(existingSchema.get());
            atMetaData.setArtifact(existingArtifact.get());
            return atMetaDataRepository.save(atMetaData);
        } else {
            throw new RuntimeException("ATMetaDataSchema is not present for this ID");
        }
	}
	
	public List<ATMetaDataModel> getAllATMetaData(){
		return atMetaDataRepository.findAll();
	}
	
	public Optional<ATMetaDataModel> getATMetaData(int atMetaDataId){
		return atMetaDataRepository.findById(atMetaDataId);
	}
	
	
	

	
	
	

}
