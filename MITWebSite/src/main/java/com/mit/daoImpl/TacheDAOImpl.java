package com.mit.daoImpl;

import com.mit.dao.TacheDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Repository("tacheDao")
@Service("tacheDao")
@Transactional
public class TacheDAOImpl extends GenericDAOImpl implements TacheDAO{

	}
