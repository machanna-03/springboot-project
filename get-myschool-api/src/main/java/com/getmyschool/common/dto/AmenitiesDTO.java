package com.getmyschool.common.dto;

public class AmenitiesDTO {
	
	private Long id;
    private String amenitiesType;
	private String status;
	private Long createdBy;
	private String createdDate;
	private Long updatedBy;
	private String updatedDate;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAmenitiesType() {
		return amenitiesType;
	}
	public void setAmenitiesType(String amenitiesType) {
		this.amenitiesType = amenitiesType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}	
	
}
