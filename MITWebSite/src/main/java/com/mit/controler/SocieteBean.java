package com.mit.controler;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mit.dao.SocieteDAO;
import com.mit.entity.Societe;



@Component("societeBean")
@Scope("session")
@SessionScoped
public class SocieteBean {
	private static ClassPathXmlApplicationContext context;
	private static SocieteDAO societeDao;
	private Societe societe;
	private List<Societe> listSociete;
	
	
	@PostConstruct
	public void init()
	{
		context=new ClassPathXmlApplicationContext("application-context.xml");
		societeDao=(SocieteDAO) context.getBean("societeDao");
		societe=new Societe();
	}
	
	public void ajouter()
	{
		try{
			societeDao.saveOrUpdate(societe);
			societe=new Societe();
			
		}catch(Exception e)
		{
			
		}
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public List<Societe> getListSociete() {
		listSociete=(List<Societe>) societeDao.findAll(Societe.class);
		return listSociete;
	}

	public void setListSociete(List<Societe> listSociete) {
		this.listSociete = listSociete;
	}

	
	

}
