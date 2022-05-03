package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	
    	Scanner sc = new Scanner(System.in);
    	String inputInfo;
    	String name;
    	int price;
    	int count;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	while(true) {
    		inputInfo = sc.nextLine();
    		
    		if(inputInfo.equals("q")) {
    			break;
    		}
    		
    		
    		String[] infoArray = inputInfo.split(",");
    			name=infoArray[0];
	    		price=Integer.parseInt(infoArray[1]);
	    		count=Integer.parseInt(infoArray[2]);
    		Goods goods = new Goods(name, price, count);
    		gList.add(goods);
    		
    	}
    	
    	System.out.println("[입력완료]");
    	System.out.println("============================");
    	
    	int sum=0;
    	for(int i=0; i<gList.size(); i++) {
    		gList.get(i).showInfo();
    		sum+=gList.get(i).getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
		
    	
    	sc.close();
       
    }

}
