package com.cjc.vls.file.main.service;


import java.util.List;

import com.cjc.vls.file.main.model.ApprovalDoc;


public interface ApproveService 
{
	
	public void saveApproveDoc(ApprovalDoc approve);
	public List<ApprovalDoc> getApproveDoc();
	public List<ApprovalDoc> getApproveDocById(int approvedid);
	public void deleteApproveDoc(int approvedid);
}
