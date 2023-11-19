package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import com.ltim.joritz.marketplace.model.ArtifactTypeModel;

public interface ArtifactTypeService {

	ArtifactTypeModel createArtifactType(ArtifactTypeModel artifactType);
	List<ArtifactTypeModel> getAllArtifactTypes();
	Optional<ArtifactTypeModel> getArtifactType(int artifactTypeId);
}
