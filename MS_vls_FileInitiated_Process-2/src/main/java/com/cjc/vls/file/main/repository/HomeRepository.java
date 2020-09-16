package com.cjc.vls.file.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cjc.vls.file.main.model.Customer;

@Repository
public interface HomeRepository extends JpaRepository<Customer, Integer>
{
	public List<Customer> findByDocumentid(int documentid);

}
