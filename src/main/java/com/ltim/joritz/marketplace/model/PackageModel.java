package com.ltim.joritz.marketplace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PackageModel {

	@Id
	@Column(name="`packageId`")
	private int packageId;
	
	@Column(name="`packageName`")
	private String packageName;
	
	@Column(name="`packageDescription`")
	private String packageDescription;

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public PackageModel(int packageId, String packageName, String packageDescription) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
	}

	public PackageModel() {
		super();
	}
	
	
}
