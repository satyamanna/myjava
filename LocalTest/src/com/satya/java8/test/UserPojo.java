package com.satya.java8.test;

public class  UserPojo {
	
	public UserPojo(String name, String id, String address, Long effectiveDate, long txnTime ,String trnType) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.effectiveDate = effectiveDate;
		this.txnTime = txnTime;
		this.transactionType = trnType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public long getTxnTime() {
		return txnTime;
	}
	public void setTxnTime(long txnTime) {
		this.txnTime = txnTime;
	}
	private String name;
	private String id;
	private String address;
	private Long effectiveDate;
	private long txnTime ;
	private String transactionType ;
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", address=" + address + ", effectiveDate=" + effectiveDate
				+ ", txnTime=" + txnTime + ", transactionType=" + transactionType + "]";
	}
	
	
	
}