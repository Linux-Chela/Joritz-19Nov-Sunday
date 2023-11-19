package com.ltim.joritz.marketplace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.service.ATMetaDataSchemaService;

@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class ATMetaDataSchemaController {
	
	@Autowired
	ATMetaDataSchemaService atMetaDataSchemaService;
	
	
	@PostMapping("atmetadataschema/create")
	public ATMetaDataSchemaModel createATMetaDataSchema(@RequestBody ATMetaDataSchemaModel atMetaDataSchema) {
		
		return atMetaDataSchemaService.createATMetaDataSchema(atMetaDataSchema);
	}
	
	@GetMapping("atmetadataschema/getall")
	public List<ATMetaDataSchemaModel> getAllATMetaDataSchema(){
		return atMetaDataSchemaService.getAllATMetaDataSchemas();
	}

	@GetMapping("atmetadataschema/getbyid/{atMetaDataSchemaId}")
	public Optional<ATMetaDataSchemaModel> getATMetaDataSchema(@PathVariable int atMetaDataSchemaId){
		return atMetaDataSchemaService.getATMetaDataSchema(atMetaDataSchemaId);
	}
	
	@GetMapping("atmetadataschema/getbyartifacttypeid/{artifactTypeId}")
		public ResponseEntity<List<ATMetaDataSchemaModel>> getSchemaByArtifactTypeId(@PathVariable int artifactTypeId){
		List<ATMetaDataSchemaModel> schemas = atMetaDataSchemaService.getSchemaByArtifactTypeId(artifactTypeId);
		return ResponseEntity.ok(schemas);
	}
	
	
}
