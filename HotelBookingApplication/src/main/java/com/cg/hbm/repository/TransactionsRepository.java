package com.cg.hbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entity.Transactions;


@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

}
