package com.LERR.makereport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Report report=new Report();
		report.setNameFile("Reporte");
		report.setExtension("txt");
		report.setTitle(":: Reporte ::\n");
		String content=report.getTitle();
		for (int i = 0; i < 6; i++) {
			content += "\n Reporte : "+i;
		}
		report.setContent(content);
		report.makeReport();
	}

}
