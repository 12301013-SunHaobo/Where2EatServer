package com.Ngbussiness.table;

public class Reserve implements java.io.Serializable{
	
	private int reserveId;
	private int tableId;
	private int userId;
	private int customerNumber;
	private String reserveDate;
	private String arrivalDate;
	private String arrivalTime;
	private int isArrival;
	private int isPay;
	private String comments;
	

	public Reserve() {
		// TODO Auto-generated constructor stub
	}
	public Reserve(int reserveId, int tableId,int userId,int customerNumber,
			       String reserveDate, String arrivalDate,String arrivalTime,
			       int isArrival,int isPay,String comments) {
		
		this.reserveId = reserveId;
		this.tableId = tableId;
		this.userId = userId;
		this.customerNumber = customerNumber;
		this.reserveDate = reserveDate;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.isArrival = isArrival;
		this.isPay = isPay;
		this.comments = comments;
		
	}
	
	
	public int getReserveId() {
		return reserveId;
	}
	public void setReserveId(int reserveId) {
		this.reserveId = reserveId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getIsArrival() {
		return isArrival;
	}
	public void setIsArrival(int isArrival) {
		this.isArrival = isArrival;
	}
	public int getIsPay() {
		return isPay;
	}
	public void setIsPay(int isPay) {
		this.isPay = isPay;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	

}
