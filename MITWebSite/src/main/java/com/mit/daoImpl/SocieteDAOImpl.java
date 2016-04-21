package com.mit.daoImpl;

import com.mit.dao.SocieteDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//@Repository("genericDao")
@Service("societeDao")
@Transactional
public class SocieteDAOImpl extends GenericDAOImpl implements SocieteDAO{

	}
