package com.mit.controler;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
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
	private static final long serialVersionUID = -6818303104117656007L;
	private static transient ProjetDAO projetDAO;
	
	private static ClassPathXmlApplicationContext context;
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
	
	 public void onDateSelect(SelectEvent event) {
	        FacesContext facesContext = FacesContext.getCurrentInstance();
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
	    }
	
	public String ajout()
	{
		
		try {
			resAjout="";
			
			projetDAO.saveOrUpdate(projet);
			System.out.println(projet.getTitreProjet()+" "+projet.getNbrTache()+" "+projet.getDateDebut()+" "+projet.getDateFin());
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
