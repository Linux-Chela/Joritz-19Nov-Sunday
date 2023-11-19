package com.ltim.joritz.marketplace.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ATMetaDataSchemaModel extends AuditableBaseModel{
	
	@Id
	@Column(name="`atMDSchemaId`")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int atMDSchemaId;
	
	@Column(name="`metaDataName`")
	private String metaDataName;
	
	@Column(name="`dataType`")
	private String dataType;
	
	@Column(name="`isMandatory`")
	private boolean isMandatory;
	
	
	@Column(name="`status`")
	private boolean status;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="`artifactTypeId`")
	private ArtifactTypeModel artifactType;


	public int getAtMDSchemaId() {
		return atMDSchemaId;
	}


	public void setAtMDSchemaId(int atMDSchemaId) {
		this.atMDSchemaId = atMDSchemaId;
	}


	public String getMetaDataName() {
		return metaDataName;
	}


	public void setMetaDataName(String metaDataName) {
		this.metaDataName = metaDataName;
	}


	public String getDataType() {
		return dataType;
	}


	public void setDataType(String dataType) {
		this.dataType = dataType;
	}


	public boolean isMandatory() {
		return isMandatory;
	}


	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public ArtifactTypeModel getArtifactType() {
		return artifactType;
	}


	public void setArtifactType(ArtifactTypeModel artifactType) {
		this.artifactType = artifactType;
	}


	public ATMetaDataSchemaModel(int atMDSchemaId, String metaDataName, String dataType, boolean isMandatory,
			boolean status, ArtifactTypeModel artifactType) {
		super();
		this.atMDSchemaId = atMDSchemaId;
		this.metaDataName = metaDataName;
		this.dataType = dataType;
		this.isMandatory = isMandatory;
		this.status = status;
		this.artifactType = artifactType;
	}


	public ATMetaDataSchemaModel() {
		super();
	}


	
	
	
}
