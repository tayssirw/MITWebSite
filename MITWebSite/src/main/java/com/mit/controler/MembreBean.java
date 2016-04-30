package com.mit.controler;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mit.dao.MembreDAO;
import com.mit.entity.Membre;


@Component("membreBean")
@Scope("session")
@SessionScoped
public class MembreBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private static ClassPathXmlApplicationContext context;
	private static MembreDAO membreDao;
	private Membre membre;
	private List<Membre> listMembre;
	
	
	@PostConstruct
	public void init()
	{
		context=new ClassPathXmlApplicationContext("application-context.xml");
		membreDao=(MembreDAO) context.getBean("membreDao");
		membre=new Membre();

	}
	
	public void ajouter()
	{
		try{
			membreDao.saveOrUpdate(membre);
			membre=new Membre();
		//	this.listMembre=getListMembre();
			
		}catch(Exception e)
		{
			
		}
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public List<Membre> getListMembre() {
		this.listMembre=(List<Membre>) membreDao.findAll(Membre.class);
		return listMembre;
	}

	public void setListMembre(List<Membre> listMembre) {
		this.listMembre = listMembre;
	}
	
	

}
