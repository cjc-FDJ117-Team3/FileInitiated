package com.cjc.vls.file.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.ApprovalDoc;

@Repository
public interface ApproveRepository extends JpaRepository<ApprovalDoc, Integer>
{
	public ApprovalDoc findByApprovedid(int approvedid);
}
