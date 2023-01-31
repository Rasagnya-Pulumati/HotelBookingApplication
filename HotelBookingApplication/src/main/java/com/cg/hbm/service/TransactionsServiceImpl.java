package com.cg.hbm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entity.Transactions;
import com.cg.hbm.repository.TransactionsRepository;


@Service
public class TransactionsServiceImpl implements TransactionsService {
     @Autowired
	private TransactionsRepository transactionsrepository;
	
     @Override
	public Transactions addTransactions(Transactions transactions) {
		
    	 //Transactions t=transactionsrepository.save(transactions);
    
    	 return transactionsrepository.save(transactions);
    	 
		
	}
   
	
	
}
