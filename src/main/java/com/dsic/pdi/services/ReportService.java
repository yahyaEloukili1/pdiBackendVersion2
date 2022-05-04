package com.dsic.pdi.services;

import java.io.File;
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
	public String exportReport(String reportFormat) throws JRException, IOException {
		//Sort.by(Sort.Direction.DESC, "province"
		List<Projet> projets = projetRepository.findAll();
		String path = "C:\\Users\\yahya\\Downloads\\report";
		//File file =ResourceUtils.getFile("claasspath:projets.jrxml");
	
		final org.springframework.core.io.Resource fileResource = resourceLoader.getResource("classpath:allProjects.jrxml");
		File file = fileResource.getFile();
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\projets4.pdf");
		}
		return "";
	}

	public String exportReport2(String reportFormat) throws JRException, IOException {
		//Sort.by(Sort.Direction.DESC, "province"
		List<Projet> projets = projetRepository.findAll(Sort.by(Sort.Direction.DESC, "maitreOuvrage"));
		String path = "C:\\Users\\yahya\\Downloads\\report";
		//File file =ResourceUtils.getFile("claasspath:projets.jrxml");
	
		final org.springframework.core.io.Resource fileResource = resourceLoader.getResource("classpath:projetsParMo.jrxml");
		File file = fileResource.getFile();
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\projetsMO.pdf");
		}
		return "";
	}

	public String exportReportCommune(String reportFormat) throws JRException, IOException {
		//Sort.by(Sort.Direction.DESC, "province"
		List<Projet> projets = projetRepository.findAll(Sort.by(Sort.Direction.DESC, "commune"));
		String path = "C:\\Users\\yahya\\Downloads\\report";
		//File file =ResourceUtils.getFile("claasspath:projets.jrxml");
	
		final org.springframework.core.io.Resource fileResource = resourceLoader.getResource("classpath:projetsParCommune.jrxml");
		File file = fileResource.getFile();
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\projetsCommune.pdf");
		}
		return "";
	}
	public String exportReportStatut(String reportFormat) throws JRException, IOException {
		//Sort.by(Sort.Direction.DESC, "province"
		List<Projet> projets = projetRepository.findAll(Sort.by(Sort.Direction.DESC, "statut"));
		String path = "C:\\Users\\yahya\\Downloads\\report";
		//File file =ResourceUtils.getFile("claasspath:projets.jrxml");
	
		final org.springframework.core.io.Resource fileResource = resourceLoader.getResource("classpath:projetsParStatut.jrxml");
		File file = fileResource.getFile();
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\projetsStatut.pdf");
		}
		return "";
	}
	public String exportReportAxe(String reportFormat) throws JRException, IOException {
		//Sort.by(Sort.Direction.DESC, "province"
		List<Projet> projets = projetRepository.findAll(Sort.by(Sort.Direction.DESC, "axe"));
		String path = "C:\\Users\\yahya\\Downloads\\report";
		//File file =ResourceUtils.getFile("claasspath:projets.jrxml");
	
		final org.springframework.core.io.Resource fileResource = resourceLoader.getResource("classpath:projetsParAxe.jrxml");
		File file = fileResource.getFile();
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(projets);
		Map<String, Object> map = new HashMap<>();
		map.put("CreatdBy", "Java techi");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		
		 if(reportFormat.equalsIgnoreCase("pdf")){
			 LocalDateTime current = LocalDateTime.now();
			 DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			 String formatedDateTime = current.format(format);
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\projetsAxe_"+formatedDateTime+".pdf");
		}
		return "";
	}


}
