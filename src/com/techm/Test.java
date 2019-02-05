package com.techm;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false;

		// create File object
		File stockFile = new File("d://SWASTIK_BIN//EnhanceCPSGit//stockFile.txt");

		try {
		    flag = stockFile.createNewFile();
		} catch (IOException ioe) {
		     System.out.println("Error while Creating File in Java" + ioe);
		}

		System.out.println("stock file" + stockFile.getPath() + " created ");

		}
	}


