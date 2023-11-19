package com.ltim.joritz.marketplace.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name="`Versions`")
public class VersionModel extends AuditableBaseModel {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="`versionNumber`")
	private int versionNumber;
	
	@Column(name = "description")
	private String description;

	@Column(name="`timeOfRelease`")
	@CreationTimestamp
	private LocalDateTime timeOfRelease;
	
	@Column(name = "versionPath")
	private String versionPath;
	
	@Column(name="`status`")
	private boolean status;
	
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name="artifactId")
	private ArtifactModel artifact;

	public int getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(int versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTimeOfRelease() {
		return timeOfRelease;
	}

	public void setTimeOfRelease(LocalDateTime timeOfRelease) {
		this.timeOfRelease = timeOfRelease;
	}

	

	public String getVersionPath() {
		return versionPath;
	}

	public void setVersionPath(String versionPath) {
		this.versionPath = versionPath;
	}
	
	
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ArtifactModel getArtifact() {
		return artifact;
	}

	public void setArtifact(ArtifactModel artifact) {
		this.artifact = artifact;
	}

	
	

	public VersionModel(int versionNumber, String description, LocalDateTime timeOfRelease, String versionPath, boolean status,
			ArtifactModel artifact) {
		super();
		this.versionNumber = versionNumber;
		this.description = description;
		this.timeOfRelease = timeOfRelease;
		this.versionPath = versionPath;
		this.status = status;
		this.artifact = artifact;
	}

	public VersionModel() {
		super();
	}
	
	
	
	
	
}
