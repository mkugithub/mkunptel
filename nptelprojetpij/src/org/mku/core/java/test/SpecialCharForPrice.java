package org.mku.core.java.test;

public class SpecialCharForPrice {
	
	
	public static void main (String arg[])
			{
		
		//String originalPartNumber="DX/BR L,K;-1:1_6-S.MP \"";
		
		String originalPartNumber="OMEGAMARKER:300,350,400,450F, ASB";
		
		
		
		if(originalPartNumber.contains(","))
		{
			String originalPartNumber1=originalPartNumber.replaceAll(",", "-");
			//System.out.println("Updated product code after removing:  " +updateProductCode1);
			
			String updateProductCode=originalPartNumber1.replaceAll("/", "-")
	                .replaceAll(";", "-").replaceAll(":", "-").replaceAll("_", "-").replaceAll("\\.", "-")
	                .replaceAll(" ", "-").replaceAll("\"", "-");
			
			System.out.println("Updated product code:  " +updateProductCode);
		}

		
		
		
		
		
		
		
		
			}

}
