package com.mindtree.bankuser.service;

import org.springframework.stereotype.Service;

import com.mindtree.bankuser.entity.Bank;
import com.mindtree.bankuser.exception.ControllerServiceException;

@Service
public interface BankService {

	public void addBank(Bank bank) throws ControllerServiceException;

	public Object getBanks();

	public void linkBankAndUser(int bankId, int userId) throws ControllerServiceException;

}
