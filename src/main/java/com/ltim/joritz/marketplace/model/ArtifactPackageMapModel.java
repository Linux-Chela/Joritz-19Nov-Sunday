package com.ltim.joritz.marketplace.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ArtifactPackageMapModel {

	@Id
	@Column(name="`mapId`")
	private int mapId;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "`artifactId`")
    private ArtifactModel artifact;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "`packageId`")
    private PackageModel Package;
    
    
    
    
}
