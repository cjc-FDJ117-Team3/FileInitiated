package com.cjc.vls.file.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.Vls_Customer_Previous_Loan_Details;

@Repository
public interface PreviousLoanRepository extends CrudRepository<Vls_Customer_Previous_Loan_Details,Integer> {

}
