package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;

public interface ATMetaDataSchemaService {

	ATMetaDataSchemaModel createATMetaDataSchema(ATMetaDataSchemaModel atMetaDataSchema);
	List<ATMetaDataSchemaModel> getAllATMetaDataSchemas();
	Optional<ATMetaDataSchemaModel> getATMetaDataSchema(int atMetaDataSchemaId);
	List<ATMetaDataSchemaModel> getSchemaByArtifactTypeId(int artifactTypeId);

  
}
