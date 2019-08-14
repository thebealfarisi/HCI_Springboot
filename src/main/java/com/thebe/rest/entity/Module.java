package com.thebe.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="module")
public class Module {
	
	@Id
	@Column(name="module_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer moduleId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	@Fetch(FetchMode.JOIN)
	private User userId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="section_id")
	@Fetch(FetchMode.JOIN)
	private Section sectionId;
	
	@Column(name="orderData")
	private Integer orderData;

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Section getSectionId() {
		return sectionId;
	}

	public void setSectionId(Section sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getOrderData() {
		return orderData;
	}

	public void setOrderData(Integer orderData) {
		this.orderData = orderData;
	}

}
