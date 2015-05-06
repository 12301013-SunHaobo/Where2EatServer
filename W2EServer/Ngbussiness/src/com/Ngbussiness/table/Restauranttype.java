package com.Ngbussiness.table;

public class Restauranttype {
	
	private int id;
	private String name;

	public Restauranttype() {
		// TODO Auto-generated constructor stub
	}
	
	public Restauranttype(int id,String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
