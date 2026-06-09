package com.File_handing;

import java.io.File;

public class Basic {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\admin\\Desktop\\file handling\\text.txt");

		if(f.exists()) {
			System.out.println("file is present");
			System.out.println("FileName:"+f.getName());
			System.out.println("Location:"+f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.length());
		}
	}

}
