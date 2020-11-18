package com.insurance.quote.service;

import com.insurance.quote.dao.InsuranceDao;
import com.insurance.quote.dao.InsuranceDaoImpl;
import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.User_Role;

public class InsuranceServiceImpl implements InsuranceService{
	InsuranceDao dao=new InsuranceDaoImpl();

	@Override
	public int CreateProfile(User_Role profile) {
		// TODO Auto-generated method stub
		return dao.CreateProfile(profile);
		
	}

	@Override
	public int CreateAccount(Accounts account) {
		// TODO Auto-generated method stub
		return dao.CreateAccount(account);
		
	}

	@Override
	public int CreatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return dao.CreatePolicy(policy);
		
	}

	@Override
	public User_Role getUser(String userId) {
		// TODO Auto-generated method stub
		return dao.getUser(userId);
	}

}
