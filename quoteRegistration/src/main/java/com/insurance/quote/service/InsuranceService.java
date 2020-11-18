package com.insurance.quote.service;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.entity.User_Role;

public interface InsuranceService {
	public int CreateProfile(User_Role profile);
	public int CreateAccount(Accounts account);
	public int CreatePolicy(Policy policy);
	public User_Role getUser(String userId);

}
