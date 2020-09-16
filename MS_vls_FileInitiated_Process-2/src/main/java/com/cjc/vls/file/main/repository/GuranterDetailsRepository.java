package com.cjc.vls.file.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.Vls_Guranter_Details;

@Repository
public interface GuranterDetailsRepository extends CrudRepository<Vls_Guranter_Details,Integer>{

}
