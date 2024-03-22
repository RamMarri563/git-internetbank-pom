package com.inetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
  public String getApplicationUrl() {
	  String url=pro.getProperty("baseURL");
	  return url;
  }
  public String getUsername() {
	  String username=pro.getProperty("username");
	  return username;
  }
  public String getPassword() {
	  String password=pro.getProperty("password");
	  return password;
  }
  public String getChromepath() {
	  String chrome=pro.getProperty("chromepath");
	  return chrome;
  }
  public String getFirepath() {
	  String firefox=pro.getProperty("firepath");
	  return firefox;
  }
  public String getmsedge() {
	  String msedge=pro.getProperty("msedgepath");
	  return msedge;
  }
  
  
  
}
