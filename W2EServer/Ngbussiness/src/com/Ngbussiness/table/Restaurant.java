package com.Ngbussiness.table;

public class Restaurant {
	
	private int restId;
	private int typeId;
	private String restName;
	private String restAddress;
	private String restPhone;
	private String description;
	private String imgUrl;
	private float longitude;
	private float dimension;
	private int avgConsume;

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	public Restaurant(int restId,int typeId,String restName, String restAddress, 
			String restPhone,String description,String imgUrl,float longitude,
			float dimension,int avgConsume) {
		
		this.restId = restId;
		this.typeId = typeId;
		this.restName = restName;
		this.restAddress = restAddress;
		this.restPhone = restPhone;
		this.description = description;
		this.imgUrl = imgUrl;
		this.longitude = longitude;
	    this.dimension = dimension;
	    this.avgConsume = avgConsume;
		
	}
	
	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public String getRestAddress() {
		return restAddress;
	}

	public void setRestAddress(String restAddress) {
		this.restAddress = restAddress;
	}

	public String getRestPhone() {
		return restPhone;
	}

	public void setRestPhone(String restPhone) {
		this.restPhone = restPhone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getDimension() {
		return dimension;
	}

	public void setDimension(float dimension) {
		this.dimension = dimension;
	}

	public int getAvgConsume() {
		return avgConsume;
	}

	public void setAvgConsume(int avgConsume) {
		this.avgConsume = avgConsume;
	}

}
