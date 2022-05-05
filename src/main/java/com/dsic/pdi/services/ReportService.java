package com.dsic.pdi.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.dsic.pdi.dao.ProjetRepository;
import com.dsic.pdi.entities.Projet;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService {
	
	@Autowired
	private ProjetRepository projetRepository;
	@Autowired
	private ResourceLoader resourceLoader;
	public String exportReport(String reportFormat,String fileInput,String fileOutput) throws JRException, IOException {
		List<Projet> projets = projetRepository.findAll();
		String path = "C:\\report";
	//"C:\\allProjects.jrxml")
		JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream(fileInput));

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			// "\\allProjects.pdf"
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+fileOutput);
		}
		return "";
	}

	public String exportReportByGroup(String reportFormat,String fileInput,String fileOutput,String group) throws JRException, IOException {
		List<Projet> projets = projetRepository.findAll(Sort.by(Sort.Direction.DESC, group));
		String path = "C:\\report";

		JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream(fileInput));

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+fileOutput);
		}
		return "";
		
	}



}
