package com.Ngbussiness.table;

public class Tables {
	
	private int tableId;
	private int restId;
	private String tableNo;
	private int is_reserved;
	private int seatNumber;
	private int is_using;

	public Tables() {
		// TODO Auto-generated constructor stub
	}
	
	public Tables(int tableId,int restId,String tableNo,
			int is_reserved,int seatNumber,int is_using){
		
		this.tableId = tableId;
		this.restId = restId;
		this.tableNo = tableNo;
		this.is_reserved = is_reserved;
		this.seatNumber = seatNumber;
		this.is_using = is_using;
		
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getTableNo() {
		return tableNo;
	}

	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	public int getIs_reserved() {
		return is_reserved;
	}

	public void setIs_reserved(int is_reserved) {
		this.is_reserved = is_reserved;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getIs_using() {
		return is_using;
	}

	public void setIs_using(int is_using) {
		this.is_using = is_using;
	}

}
