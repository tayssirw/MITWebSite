package com.mit.daoImpl;

import com.mit.dao.ContrattacheDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



//@Repository("contrattacheDao")
@Service("contrattacheDao")
@Transactional
public class ContrattacheDAOImpl extends GenericDAOImpl implements ContrattacheDAO{

}
