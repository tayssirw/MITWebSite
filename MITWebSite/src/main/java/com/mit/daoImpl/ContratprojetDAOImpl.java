package com.mit.daoImpl;

import com.mit.dao.ContratprojetDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository("contratprojetDao")
@Transactional
public class ContratprojetDAOImpl extends GenericDAOImpl implements ContratprojetDAO {
}
