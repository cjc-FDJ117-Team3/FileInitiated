package com.cjc.vls.file.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.SanctionLetter;

@Repository
public interface SanctionLetterRepository extends JpaRepository<SanctionLetter, Integer> {

	public List<SanctionLetter> findBySactionLetterId(int sactionLetterId);

	public List<SanctionLetter> findSactionLetterBySactionLetterId(int sactionLetterId);

}
