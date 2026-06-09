package com.File_handing;

import java.io.File;

public class List_Method {
	public static void main(String[] args) {
		File f2 =new File("C:\\Users\\admin\\Desktop\\file handling");
		
		if(f2.exists()&& f2.isDirectory()) {
			String ff[]=f2.list();
			
			if(ff!=null && ff.length>0) {
				for(String ee:ff) {
					System.out.println(ee);
				}
			}else {
				System.out.println("Directory is empty");
			}
		}else {
			System.out.println("Directory is not exist");
		}
	}

}
