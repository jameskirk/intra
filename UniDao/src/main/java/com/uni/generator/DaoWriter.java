package com.uni.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DaoWriter {
	
	private String entityPackage;
	
	private String iDaoPackage;
	
	private String entityName;
	
	public DaoWriter(String entityPackage, String iDaoPackage, String entityName) {
		this.entityPackage = entityPackage;
		this.iDaoPackage = iDaoPackage;
		this.entityName = entityName;
	}

	public void generateDao() {
		final String templateName = "IDaoTemplate";
		String fileDao = Main.SRC + getInterfacePath() + "//" + getInterfaceName() + ".java";
		String fileTemplate = Main.RES + templateName;
		readAndWrite(fileTemplate, fileDao, true);
	}
	
	public void generateDaoImpl() {
		final String templateName = "DaoTemplate";
		String fileDao = Main.SRC + getClassPath() + "//" + getClassName() + ".java";
		String fileTemplate = Main.RES + templateName;
		readAndWrite(fileTemplate, fileDao, false);
	}
	
	private void readAndWrite(String fileTemplate, String fileDao, boolean isInterface) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileTemplate));
			BufferedWriter out = new BufferedWriter(new FileWriter(fileDao));
			while (in.ready()) {
				String s = in.readLine();
				String retS;
				if (isInterface) {
					retS = modifyInterfaceText(s);
				} else {
					retS = modifyClassText(s);
				}
				out.write(retS + "\n");
			}
			out.flush();
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String modifyInterfaceText(String fileText) {
		String retVal = fileText;
		retVal = retVal.replace("%iDaoPackage%", iDaoPackage)
				.replace("%entityPackage%", entityPackage)
				.replace("%entityName%", entityName)
				.replace("%iDaoName%", getInterfaceName());
		return retVal;
	}
	
	private String modifyClassText(String fileText) {
		String retVal = fileText;
		retVal = retVal.replace("%iDaoPackage%", iDaoPackage)
				.replace("%daoPackage%", iDaoPackage + ".impl")
				.replace("%entityPackage%", entityPackage)
				.replace("%entityName%", entityName)
				.replace("%iDaoName%", getInterfaceName())
				.replace("%daoName%", getClassName());
		return retVal;
	}
	
	private String getInterfacePath() {
		return iDaoPackage.replace(".", "//");
	}
	
	private String getClassPath() {
		return getInterfacePath() + "//impl";
	}
	
	private String getInterfaceName() {
		return "I" + entityName + "Dao";
	}
	
	private String getClassName() {
		return entityName + "Dao";
	}
	

}
