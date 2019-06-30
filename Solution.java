package txtFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Date;

public class Solution {

	public static void main(String[] args) {
		
		List<detail> d=readFileFromtxt("input.txt");
		/*for(detail f: d)
		{
			System.out.println(f);
		}*/
		
		policyAvailable(d);
		expiredfun(d);
		
	}
	
	
	private static List<detail> readFileFromtxt(String fileName)
	{
		List<detail> d1=new ArrayList<>();
		Path pathToFile=Paths.get(fileName);//to get the filepath
		
		try(BufferedReader br=Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
			String line=br.readLine();
			while(line!=null)
			{
				String[] attributes=line.split(" ");
				detail file=createList(attributes);
				d1.add(file);
				line=br.readLine();
			}
		} catch(IOException e)
		{
			e.printStackTrace(); //it prints the error class and error line
		}
		return d1;
	}
	private static detail createList(String[] metadata)
	{
		String PolicyNo=metadata[0];
		String CostofPolicy=metadata[1];
		String DateofExp=metadata[2];
		String DateofAd=metadata[3];
		String DateofDischarge=metadata[4];
		String MedicalSpec=metadata[5];
		
		return new detail(PolicyNo,CostofPolicy, DateofExp,DateofAd,DateofDischarge,MedicalSpec);
	
	}
	private static void policyAvailable(List<detail> d2)
	{
	         String s="";
	         String w="";
		
		for(detail i:d2)
		{
			int sum=0;
			
		String dum=i.getPolicyNo().substring(0,2);
		
		for(detail z:d2) {
			
	      s=z.getPolicyNo();
	      w=z.getMedicalSpec();
	    
	     
	     if((s.contains(dum)) && (!w.contains("**"))) {
	    	 String ex=z.getCostofPolicy();
	    	 int foo=Integer.parseInt(ex);
	    	 z.setMedicalSpec("**");
             sum+=foo;
	     }
		}
		if(!w.contains("**"))
		{
		System.out.println(dum+" "+sum);
		}
		
		
		}


	}
	private static void expiredfun(List<detail> d3)
	{
		for(detail i:d3) 
		{
			try {
		String s=i.getDateofDischarge(); 
		String t=i.getDateofExp();
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 
		Date date1=formatter1.parse(s);
		Date date2=formatter1.parse(t); 
		try {
		if(date1.compareTo(date2)>0)
		{
			String var=i.getPolicyNo();
		    throw new MyException(var);
		}
			
		}
		catch(MyException e) {
			System.out.println(e);
		}
		
		}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
		}
	}
	}
