package com.example.swe.hw3.model;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "surveyForm")

public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable = false)
	private String first_name;
	
	@Column(name="last_name", nullable = false)
	private String last_name;
	
	
	@Column(name="street_address", nullable = false)
	private String street_address;
	
	@Column(name="city", nullable = false)
	private String city;
	
	@Column(name="state", nullable = false)
	private String state;
	
	@Column(name="zip", nullable = false)
	private int zip;
	
	@Column(name="telephone_number", nullable = false)
	private long telephone_number;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="dos", nullable = false)
	private String dos;
	
	@Column(name="mostLiked")
	private String[] mostLiked=new String[10];
	
	@Column(name="InterestUniv")
	private String InterestUniv;
	
	@Column(name="likelyRecommend")
	private String likelyRecommend;
	
	@Column(name="comments")
	private String comments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getTelephone_number() {
		return telephone_number;
	}

	public void setTelephone_number(long telephone_number) {
		this.telephone_number = telephone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDos() {
		return dos;
	}

	public void setDos(String dos) {
		this.dos = dos;
	}

	public String[] getMostLiked() {
		return mostLiked;
	}

	public void setMostLiked(String[] mostLiked) {
		this.mostLiked = mostLiked;
	}

	public String getInterestUniv() {
		return InterestUniv;
	}

	public void setInterestUniv(String interestUniv) {
		InterestUniv = interestUniv;
	}

	public String getLikelyRecommend() {
		return likelyRecommend;
	}

	public void setLikelyRecommend(String likelyRecommend) {
		this.likelyRecommend = likelyRecommend;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mostLiked);
		result = prime * result + Objects.hash(InterestUniv, city, comments, dos, email, first_name, id, last_name,
				likelyRecommend, state, street_address, telephone_number, zip);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		return Objects.equals(InterestUniv, other.InterestUniv) && Objects.equals(city, other.city)
				&& Objects.equals(comments, other.comments) && Objects.equals(dos, other.dos)
				&& Objects.equals(email, other.email) && Objects.equals(first_name, other.first_name) && id == other.id
				&& Objects.equals(last_name, other.last_name) && Objects.equals(likelyRecommend, other.likelyRecommend)
				&& Arrays.equals(mostLiked, other.mostLiked) && Objects.equals(state, other.state)
				&& Objects.equals(street_address, other.street_address) && telephone_number == other.telephone_number
				&& zip == other.zip;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", street_address="
				+ street_address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", telephone_number="
				+ telephone_number + ", email=" + email + ", dos=" + dos + ", mostLiked=" + Arrays.toString(mostLiked)
				+ ", InterestUniv=" + InterestUniv + ", likelyRecommend=" + likelyRecommend + ", comments=" + comments
				+ "]";
	}
	
	
	
	
}
