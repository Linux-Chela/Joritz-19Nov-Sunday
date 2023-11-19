package com.ltim.joritz.marketplace.model;


import java.sql.Timestamp;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
public abstract class AuditableBaseModel {

	@CreatedBy
	@Column(name="`created_by`", updatable=false)
	private String createdBy;
	
	@CreatedDate
	@Column(name="`created_dt`", updatable =false)
	private Timestamp createdDt;
	
	@LastModifiedBy
	@Column(name="`modified_by`")
	private String modifiedBy;
	
	@LastModifiedDate
	@Column(name="`modified_dt`")
	private Timestamp modifiedDt;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDt() {
		return modifiedDt;
	}

	public void setModifiedDt(Timestamp modifiedDt) {
		this.modifiedDt = modifiedDt;
	}
	
	
}