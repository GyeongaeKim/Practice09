package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	ArrayList<Friend> fArray = new ArrayList<Friend>();
    	
    	Scanner sc = new Scanner(System.in);
    	String inputInfo;
    	String name;
    	String hp;
    	String school;
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	while(true) {
    		
    		if(fArray.size()>=3) {
    			break;
    		}
    		
    		inputInfo = sc.nextLine();
    		String[] infoArray = inputInfo.split(" ");
    			name=infoArray[0];
	    		hp=infoArray[1];
	    		school=infoArray[2];
    		Friend friend = new Friend(name, hp, school);
    		fArray.add(friend);
    		
    	}
    	
    	for(int i=0; i<fArray.size(); i++) {
    		fArray.get(i).showInfo();
    	}
    	
		
    	
    	sc.close();
    	
    }

}
