package com.cjc.vls.file.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.Vls_Customer_Pre_Loan_Amount_Details;

@Repository
public interface PreviousLoanAmountRepository extends CrudRepository<Vls_Customer_Pre_Loan_Amount_Details,Integer>{

}
