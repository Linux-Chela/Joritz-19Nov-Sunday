package com.ltim.joritz.marketplace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.service.ArtifactTypeService;

@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class ArtifactTypeController {
	
	@Autowired
	ArtifactTypeService artifactTypeService;
	
	
	@PostMapping("artifacttype/create")
	public ArtifactTypeModel createArtifactType(@RequestBody ArtifactTypeModel artifactType) {
		return artifactTypeService.createArtifactType(artifactType);
	}
	
    @GetMapping("artifacttype/getall")
    public List<ArtifactTypeModel> getAllArtifactTypes(){
    	System.out.println("Displaying All Types of Artifacts...");
    	return artifactTypeService.getAllArtifactTypes();
    }
    
    @GetMapping("artifacttype/getartifacttype/{artifactTypeId}")
    public Optional<ArtifactTypeModel> getArtifactType(@PathVariable int artifactTypeId) {
    	System.out.println("Displaying Single Type of Artifact");
    	return artifactTypeService.getArtifactType(artifactTypeId);
    }
    
    

}
