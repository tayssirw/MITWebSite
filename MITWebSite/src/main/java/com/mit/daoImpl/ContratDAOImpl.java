package com.mit.daoImpl;

import com.mit.dao.ContratDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



//@Repository("contratDao")
@Service("contratDao")
@Transactional
public class ContratDAOImpl extends GenericDAOImpl implements ContratDAO {

}
