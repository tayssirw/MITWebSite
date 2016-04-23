package com.mit.daoImpl;

import com.mit.dao.ProjetDAO;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//@Repository("projetDao")
@Service("projetDao")
@Transactional
public class ProjetDAOImpl extends GenericDAOImpl implements ProjetDAO{

	}
