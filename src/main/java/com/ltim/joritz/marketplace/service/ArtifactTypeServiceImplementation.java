package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.repository.ArtifactTypeRepository;

@Service
public class ArtifactTypeServiceImplementation implements ArtifactTypeService{
	
	@Autowired
	private ArtifactTypeRepository artifactTypeRepository;

	public ArtifactTypeModel createArtifactType(ArtifactTypeModel artifactType) {
		System.out.println("ArtifactType Created!");
		return artifactTypeRepository.save(artifactType);
	}
	
	
	public List<ArtifactTypeModel> getAllArtifactTypes() {
		System.out.println("Displaying All Artifact Types...");
		return artifactTypeRepository.findAll();
	}
	
	public Optional<ArtifactTypeModel> getArtifactType(int artifactTypeId) {
		System.out.println("Displaying Single Type of Artifact...");
		return artifactTypeRepository.findById(artifactTypeId);
	}
}
