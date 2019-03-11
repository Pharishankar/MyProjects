package com.hari;

import java.security.NoSuchAlgorithmException;

public class Test {
	
	public static void main(String[] args) {
		
		String pass="12345";
		System.out.println("MD5 algorithim: "+Encryption.MD5(pass));
		try {
			System.out.println("SHA1 algorith: "+Encryption.SHA1(pass));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
