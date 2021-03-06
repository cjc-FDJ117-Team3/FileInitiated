package com.cjc.vls.file.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.CustomerDetail;
import com.cjc.vls.file.main.model.CustomerReview;
@Repository
public interface CustomerDetailRepository extends CrudRepository<CustomerDetail, Integer> {


}
