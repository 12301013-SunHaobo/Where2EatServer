package com.Ngbussiness.util;

public class DataTools {
	public static String StringToHexString(String str){ 
		byte[] src=str.getBytes();
		    StringBuilder stringBuilder = new StringBuilder("");  
		    if (src == null || src.length <= 0) {  
		        return null;  
		    }  
		    for (int i = 0; i < src.length; i++) {  
		        int v = src[i] & 0xFF;  
		        String hv = Integer.toHexString(v);  
		        if (hv.length() < 2) {  
		            stringBuilder.append(0);  
		        }  
		        stringBuilder.append(hv);  
		    }  
		    return stringBuilder.toString();  
		}  
		   public static String HexStringhtoString(String s) 
		    { 
		    byte[] baKeyword = new byte[s.length()/2]; 
		    for(int i = 0; i < baKeyword.length; i++) 
		    { 
		    try 
		    { 
		    baKeyword[i] = (byte)(0xff & Integer.parseInt(s.substring(i*2, i*2+2),16)); 
		    } 
		    catch(Exception e) 
		    { 
		    e.printStackTrace(); 
		    } 
		    } 
		    try 
		    { 
		    s = new String(baKeyword, "utf-8");//UTF-16le:Not 
		    } 
		    catch (Exception e1) 
		    { 
		    e1.printStackTrace(); 
		    } 
		    return s; 
		    } 

	
}
