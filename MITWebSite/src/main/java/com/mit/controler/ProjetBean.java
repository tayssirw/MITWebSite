package com.mit.controler;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mit.dao.ProjetDAO;
import com.mit.entity.Projet;
@Component("projetBean")
@Scope("session")
@SessionScoped

public class ProjetBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ClassPathXmlApplicationContext context;
	private static ProjetDAO projetDAO;
	private Projet projet;
	private String resAjout;
	private List<Projet> listProjet;

	
	@PostConstruct
	public void init(){
		context=new ClassPathXmlApplicationContext("application-context.xml");
		projetDAO= (ProjetDAO) context.getBean("projetDao");
		projet=new Projet();
		resAjout="";
	}
	
	
	public String ajout()
	{
		
		try {
			resAjout="";
			projetDAO.saveOrUpdate(projet);
			projet= new Projet();
			resAjout = "projet ajouté";
			return"valide";
		} catch (Exception e) {
			resAjout="n est pas ajouté";
			return"echec";
		}
	}
	
	
	
	
	

	public List<Projet> getListProjet() {
		this.listProjet=(List<Projet>) projetDAO.findAll(Projet.class);
		return listProjet;
	}


	public void setListProjet(List<Projet> listProjet) {
		this.listProjet = listProjet;
	}


	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public String getResAjout() {
		return resAjout;
	}

	public void setResAjout(String resAjout) {
		this.resAjout = resAjout;
	}
	
	
	
}
