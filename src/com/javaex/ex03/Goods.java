package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	private int count;
	
	
	//생성자
	public Goods() {
		super();
	}
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	
	//메소드 gs
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
	public void showInfo() {
		System.out.println(name + "(가격:" + price + "원)이 " + count + " 개 입고 되었습니다.");
	}
	
	

}
