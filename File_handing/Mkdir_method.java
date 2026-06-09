package com.File_handing;

import java.io.File;

public class Mkdir_method {
	public static void main(String[] args) {
		File f= new File(";folder");
		
		if(f.mkdir()) {
			System.out.println("Folder is crate");
			System.out.println(f.getAbsolutePath());
		}
		else {
			System.out.println("not create");
		}
	}

}
