package com.example.stockspring.model;
import java.io.*;
import java.util.*;
public class StockExchange {
private int id;
private String stockExchange;
private String brief;
private String address;
private String remarks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStockExchange() {
	return stockExchange;
}
public void setStockExchange(String stockExchange) {
	this.stockExchange = stockExchange;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
}
