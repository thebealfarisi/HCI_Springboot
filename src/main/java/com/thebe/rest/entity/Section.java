package com.thebe.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="section")
public class Section {
	
	@Id
	@Column(name="section_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sectionId;
	
	@Column(name="section_name")
	private String sectionName;
	
	@Column(name="section_card_name")
	private String sectionCardName;

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getSectionCardName() {
		return sectionCardName;
	}

	public void setSectionCardName(String sectionCardName) {
		this.sectionCardName = sectionCardName;
	}

}
