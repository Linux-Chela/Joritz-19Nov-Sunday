package com.ltim.joritz.marketplace.controller;



import java.util.HashMap;
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

import com.ltim.joritz.marketplace.model.ATMetaDataModel;
import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.service.ATMetaDataSchemaService;
import com.ltim.joritz.marketplace.service.ATMetaDataService;
import com.ltim.joritz.marketplace.service.ArtifactService;



@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class ArtifactController {
		
		@Autowired
		private ArtifactService artifactService;
		@Autowired
		ATMetaDataService atMetaDataService;
		@Autowired
		private ATMetaDataSchemaService atMetaDataSchemaService;
		
		
		
		
//		@PostMapping("artifact/create")
//		public  ArtifactModel createArtifact(@RequestBody ArtifactModel artifactBody) {
//			System.out.println("Created Artifact with id: "+artifactBody.getArtifactid());
//			return artifactService.createArtifact(artifactBody);
//		}
		
		@GetMapping("artifact/getall")
		public List<ArtifactModel> getAllArtifacts() {
			System.out.println("Displaying All Artifacts...");
			return artifactService.getAllArtifacts();
		}
		
		@GetMapping("artifact/getartifact/{artifactId}")
		public Optional<ArtifactModel> getArtifact(@PathVariable int artifactId) {
			System.out.println("Displaying Single Artifact with ID: " + artifactId);
			return artifactService.getArtifact(artifactId);
		}
		
		
		
		///////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		@PostMapping("artifact/create")
		public  ArtifactModel createArtifact(@RequestBody ArtifactModel artifactBody) {
			
			ArtifactModel obj= artifactService.createArtifact(artifactBody);
			System.out.println("Created Artifact with id: "+artifactBody.getArtifactid());
			
			int artifactId=obj.getArtifactid();
			int artifactTypeId = artifactBody.getArtifactType().getArtifactTypeId();
	        HashMap<String,String>metaData=artifactBody.getMetaData();
	        List<ATMetaDataSchemaModel>metaSchema =atMetaDataSchemaService.getSchemaByArtifactTypeId(artifactTypeId);
	        
	        ArtifactModel artifactObj = entityManager.find(ArtifactModel.class, artifactId);
	        System.out.println("-------"+artifactObj);
	        if (artifactObj == null) {
	         	System.err.println("Error: ArtifactModel not found for ID: " + artifactId);
	            return null; 
	        }
	        for (int i = 0; i < metaSchema.size(); i++) {
	            try {
	                // Check if metadata exists for the current metaSchema ID
	                if (metaData.containsKey(Integer.toString(metaSchema.get(i)))) {
//	                    ArtifactModel artifactObj = entityManager.find(ArtifactModel.class, artifactId);

	                    if (artifactObj == null) {
	                        System.err.println("Error: ArtifactModel not found for ID: " + artifactId);
	                        // Handle the case where the ArtifactModel is not found
	                        return null; // or throw an exception
	                    }

	                    ATMetaDataSchemaModel atMetaDataSchemaModel = new ATMetaDataSchemaModel();
	                    atMetaDataSchemaModel.setAtMDSchemaId(metaSchema.get(i));

	                    ATMetaDataModel values = new ATMetaDataModel(atMetaDataSchemaModel, artifactObj, metaData.get(Integer.toString(metaSchema.get(i))));
	                    System.out.println(values);

	                    atMetaDataService.createATMetaData(values);
	                } else {
	                    System.out.println("No metadata found for metaSchema ID: " + metaSchema.get(i));

	                }
	            } catch (Exception e) {
	                System.err.println("Error creating ATMetaDataModel: " + e.getMessage());
	            }
	        }	return artifactBody;
		}	
		
}