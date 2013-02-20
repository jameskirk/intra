package com.uni.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public final static String SRC = System.getProperty("user.dir") + "//src//main//java//";
	
	public final static String RES = System.getProperty("user.dir") + "//src//main//resources//generator//";
	
	private final static String DAO = "com.uni.dao";
	
	public static void main(String[] args) {
		Main m = new Main();
//		m.generateOne("com//uni//jpa//security//Registraion.java", "com.uni.jpa.security");
		m.generateAll(Arrays.asList("com.uni.jpa.base", "com.uni.jpa.security", "com.uni.jpa.studies"));
	}
	
	public void generateAll(List<String> packages) {
		for (String pack: packages) {
			File file = new File(SRC + pack.replace(".", "//"));
			for (File f: file.listFiles()) {
				if (f.isFile() && !isEnum(f)) {
					String entityName = f.getName().replace(".java", "");
					DaoWriter writer = new DaoWriter(pack, DAO, entityName);
					writer.generateDao();
			        writer.generateDaoImpl();
					System.out.println("generated for: " + entityName);
				}
				
			}
		}
	}
	
	public void generateOne(String packageAndName, String package1) {
		File file = new File(SRC + packageAndName);
		String entityName = file.getName().replace(".java", "");
		DaoWriter writer = new DaoWriter(package1, DAO, entityName);
		writer.generateDao();
        writer.generateDaoImpl();
		System.out.println("generated for: " + entityName);
	}
	
	private boolean isEnum(File file) {
		Boolean retVal = false;
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			while (in.ready()) {
				String s = in.readLine();
				if (s.contains("public enum ")) {
					retVal = true;
					break;
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;
	}

}
