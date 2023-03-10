package com.cg.hbm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entity.Transactions;
import com.cg.hbm.service.TransactionsServiceImpl;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {
 
	 @Autowired
	private TransactionsServiceImpl transactionsServiceImpl;
	 
	 @PostMapping("/createTransactions")
	 public ResponseEntity<Transactions> createTransactions(@RequestBody Transactions transactions)
	 {
		 Transactions t=transactionsServiceImpl.addTransactions(transactions);
		 return new ResponseEntity<Transactions>(t,HttpStatus.CREATED);
	 }
	 
	 
}
