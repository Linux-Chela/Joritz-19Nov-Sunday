package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import com.ltim.joritz.marketplace.model.ArtifactModel;

public interface ArtifactService {

	
	ArtifactModel createArtifact(ArtifactModel artifact);
	List<ArtifactModel> getAllArtifacts();
	Optional<ArtifactModel> getArtifact(int artifactId);
}
