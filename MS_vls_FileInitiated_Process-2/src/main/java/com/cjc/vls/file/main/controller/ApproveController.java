package com.cjc.vls.file.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vls.file.main.model.ApprovalDoc;
import com.cjc.vls.file.main.service.ApproveService;

@RestController
@CrossOrigin("*")
@RequestMapping("appr")
public class ApproveController 
{

			@Autowired
			ApproveService as;
		
			@RequestMapping(value = "/approved", method = RequestMethod.POST)
			public String approvedDoc(@RequestBody ApprovalDoc approve)
			{
				as.saveApproveDoc(approve);
				return "Approved By CM !!!! Please release Sanction letter as per LOAN Details";
			}

			@RequestMapping(value = "/getData",method = RequestMethod.GET)
			public List<ApprovalDoc> getData()
			{
				List<ApprovalDoc> list=as.getApproveDoc();
				return list;
			}
			
			@RequestMapping(value = "/getDataApprId/{approvedid}", method = RequestMethod.GET)
			public List<ApprovalDoc> getDoc(@PathVariable("approvedid") int approvedid)
			{
				List<ApprovalDoc> ddl=as.getApproveDocById(approvedid);
				if(ddl.isEmpty()) 
				{
					String str="Document Details are not present";
					return null;
				}
				else 
				{
					return ddl;
				}		
			}
			// delete Documents by id
			
			@RequestMapping(value = "/deleteData/{approvedid}",method = RequestMethod.DELETE)
		     public String deleteData(@PathVariable ("approvedid") int approvedid) 
			{
				as.deleteApproveDoc(approvedid);
				return "Record Deleted Successfully";
		     }
			
			//update Documents
			
			@RequestMapping(value = "/updateData",method = RequestMethod.PUT)
			public String updateDoc(@RequestBody ApprovalDoc approve)
			{
				as.saveApproveDoc(approve);	
				return "Record updated Successfully";	
		}			
}
