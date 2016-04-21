package com.mit.daoImpl;

import com.mit.dao.MembreDAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("membreDao")
//@Service("membreDao")

@Transactional
public class MembreDAOImpl extends GenericDAOImpl implements MembreDAO{

	} 