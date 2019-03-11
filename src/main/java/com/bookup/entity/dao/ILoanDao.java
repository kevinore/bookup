package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Loan;

public interface ILoanDao extends CrudRepository<Loan, Long>{

}
