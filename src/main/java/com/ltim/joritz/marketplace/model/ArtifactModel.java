package com.ltim.joritz.marketplace.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="`Artifact`")
public class ArtifactModel extends AuditableBaseModel{
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="`artifactId`")
	private int artifactid;
	
	
	@Column(name="`artifactDescription`")
	private String artifactDescription;
	
	@Column(name="`artifactName`")
	private String artifactName;
	
	
	@Column(name="`documentation`")
	private String documentation;
	
	@Column(name="`isPublic`")
	private boolean isPublic;
	
	@Column(name="`status`")
	private boolean status;

	@Column(name="`downloaded`")
	private long downloaded;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="`artifactTypeId`")
	public ArtifactTypeModel artifactType;
	
	
	

	public int getArtifactid() {
		return artifactid;
	}

	public void setArtifactid(int artifactid) {
		this.artifactid = artifactid;
	}

	public String getArtifactDescription() {
		return artifactDescription;
	}

	public void setArtifactDescription(String artifactDescription) {
		this.artifactDescription = artifactDescription;
	}

	public String getArtifactName() {
		return artifactName;
	}

	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}


	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	public long getDownloaded() {
		return downloaded;
	}

	public void setDownloaded(long downloaded) {
		this.downloaded = downloaded;
	}

	public ArtifactTypeModel getArtifactType() {
		return artifactType;
	}

	public void setArtifactType(ArtifactTypeModel artifactType) {
		
		this.artifactType = artifactType;
	}

	public ArtifactModel(int artifactid, String artifactDescription, String artifactName,
			String documentation, boolean isPublic, boolean status, long downloaded, ArtifactTypeModel artifactType) {
		super();
		this.artifactid = artifactid;
		this.artifactDescription = artifactDescription;
		this.artifactName = artifactName;
		this.documentation = documentation;
		this.isPublic = isPublic;
		this.status = status;
		this.downloaded = downloaded;
		this.artifactType = artifactType;
	}

	public ArtifactModel() {
		super();
	}
	
	
	

}
