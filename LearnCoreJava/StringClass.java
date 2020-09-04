package com.aig.test.rpa.custom.script;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.io.Files;

public class ISOExcel {

       public static void main(String[] args) throws IOException {
              // TODO Auto-generated method stub
              
              

    	   
  	   String S= "Sathiya";
    	   S.concat("Sush");
    	   System.out.println(S);
    	   
    	   StringBuffer sb=new StringBuffer("Sathiya");
    	   sb.append("Hello");
    	   System.out.println(sb);
    	   
    	   StringBuffer sb1=new StringBuffer("Sathiya");
    	   sb1.insert(2, "Hello");
    	   System.out.println(sb1);
    	   
    	   StringBuffer sb2=new StringBuffer("Sathiya");
    	   sb2.replace(1, 4, "Sushant");
    	   System.out.println(sb2);
    	   
    	   StringBuffer sb3=new StringBuffer("Sathiya");
    	   sb3.delete(1, 3);
    	   System.out.println(sb3);
    	   
    	   StringBuffer sb4=new StringBuffer();
    	   System.out.println(sb4.capacity());
    	   sb4.append("Sathiya");
    	   System.out.println(sb4.capacity());
    	   sb4.append("Sathiya is a fashionista");
    	   System.out.println(sb4.capacity());
    	   
    	   String s= "Selenium";
    	   for(int i = 0; i < s.length(); i++) {
    		   
    		   char c = s.charAt(i);
     	      System.out.println(s.charAt(i));
    		   for(int j=0;j<=i;j++){ 
    	   
    	      
    	      System.out.print("* ");  
    	   }
  		   }
    	   
    	   
    	   // Splitting alphabets and digits
    	   

    	   String str="Selenium123456";
			for(int i=0;i<str.length();i++) {
				char c1=str.charAt(i);
				
				
				if (Character.isAlphabetic(c1)) {
				
					System.out.println("Alphabets"   + " " +  c1);
				
			}
    	   
			else {
				
				if(Character.isDigit(c1)) {
					
					System.out.println("Digits"+ " " +  c1);
				}
				
			}

				
}

       }
}


