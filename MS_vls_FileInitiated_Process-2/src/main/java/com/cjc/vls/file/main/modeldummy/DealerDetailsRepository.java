package com.cjc.vls.file.main.modeldummy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DealerDetailsRepository extends JpaRepository<DealerDetails, Integer> {

}
