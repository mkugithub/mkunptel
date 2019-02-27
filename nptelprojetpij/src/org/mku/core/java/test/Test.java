package org.mku.core.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Current system time in milisecond  " + System.currentTimeMillis());
		
		String baseProdcuct="CIR-1016/120V/18C/12,\"LDS";
		
		//-DP9800-TC-Testing-
		//-CIR-1016-120V-18C-12--LDS-
		String modifiedProductCode="-DP9800-TC-Testing-";
		
		
		String c= "CIR-1016\"$/120V/,;18C/12,&_-LDS\"";
        Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
        Matcher match= pt.matcher(c);
        while(match.find())
        {
        String s= match.group();
        c=c.replaceAll("\\"+s,  "-");
       // System.out.println(c1);
        }
       // System.out.println(c);
		
		
				
				
		String	baseProductId =baseProdcuct.replaceAll("/",  "-")
		        .replaceAll(",", "-").replaceAll(";", "-").replaceAll(":", "-").replaceAll("_", "-").replaceAll(",", "-").replaceAll("\"", "-");
	
		System.out.println(" Base Product is"+baseProductId);
		
		System.out.println("modifiedProductCode " +modifiedProductCode.substring(1, modifiedProductCode.length()-1));
		
	}

}
