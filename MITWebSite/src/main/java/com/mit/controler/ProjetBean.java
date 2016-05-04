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
import com.mit.dao.TacheDAO;
import com.mit.entity.Projet;
import com.mit.entity.Tache;
@Component("projetBean")
@Scope("session")
@SessionScoped

public class ProjetBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6818303104117656007L;
	private static transient ProjetDAO projetDAO;
	private static transient TacheDAO tacheDAO;
	private static ClassPathXmlApplicationContext context;
	private Projet projet;
	private Tache tache;
	private String resAjout;
	private List<Projet> listProjet;
	private List<Tache> listTaches;

	
	@PostConstruct
	public void init(){
		context=new ClassPathXmlApplicationContext("application-context.xml");
		projetDAO= (ProjetDAO) context.getBean("projetDao");
		tacheDAO=(TacheDAO) context.getBean("tacheDao");
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
			//System.out.println(projet.getTitreProjet()+" "+projet.getNbrTache()+" "+projet.getDateDebut()+" "+projet.getDateFin());
			projet= new Projet();
			resAjout = "projet ajouté";
			return"valide";
		} catch (Exception e) {
			resAjout="n est pas ajouté";
			return"echec";
		}
	}
	
	public String ajoutTache()
	{
		
		try {
			resAjout="";
			
			tacheDAO.saveOrUpdate(tache);
			projet.setNbrTache(projet.getNbrTache()+1);
			
			tache=new Tache();
			
			return"valide";
		} catch (Exception e) {
			
			return"echec";
		}
	}
	
	
	
	

	public List<Projet> getListProjet() {
		this.listProjet=(List<Projet>) projetDAO.findAll(Projet.class);
		return listProjet;
	}
	
	public List<Tache> getListTaches() {
		this.listTaches=(List<Tache>) tacheDAO.findAll(Tache.class);
		return listTaches;
	}



	public void setListProjet(List<Projet> listProjet) {
		this.listProjet = listProjet;
	}
	
	public void setListTaches(List<Tache> listTaches) {
		this.listTaches = listTaches;
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

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	
	
}
