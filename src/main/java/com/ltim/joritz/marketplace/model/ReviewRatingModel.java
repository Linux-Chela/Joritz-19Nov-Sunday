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
public class ReviewRatingModel extends AuditableBaseModel{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="`rId`")
	private int rId;
	
	@Column(name="`rating`")
	private int rating;
	
	@Column(name="`review`")
	private String review;
	
	@Column(name="`isUserPublic`")
	private boolean isUserPublic;
	
	@Column(name="`userName`")
	private String userName;
	
	@Column(name="`userMail`")
	private String userMail;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="`artifactId`")
	private ArtifactModel artifact;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public boolean isUserPublic() {
		return isUserPublic;
	}

	public void setUserPublic(boolean isUserPublic) {
		this.isUserPublic = isUserPublic;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public ArtifactModel getArtifact() {
		return artifact;
	}

	public void setArtifact(ArtifactModel artifact) {
		this.artifact = artifact;
	}

	public ReviewRatingModel(int rId, int rating, String review, boolean isUserPublic, String userName, String userMail,
			ArtifactModel artifact) {
		super();
		this.rId = rId;
		this.rating = rating;
		this.review = review;
		this.isUserPublic = isUserPublic;
		this.userName = userName;
		this.userMail = userMail;
		this.artifact = artifact;
	}

	public ReviewRatingModel() {
		super();
	}
	
	
}
