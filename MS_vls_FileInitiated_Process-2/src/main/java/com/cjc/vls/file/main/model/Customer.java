package com.cjc.vls.file.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int documentid;
	@Lob
	private byte [] adharCard;
	@Lob
	private byte [] panCard;
	@Lob
	private byte [] photo;
	@Lob
	private byte [] signature;
	@Lob
	private byte [] addressProof;
	@Lob
	private byte [] bankStatement;
	@Lob
	private byte [] salarySleep;
	@Lob
	private byte [] thumb;
	@Lob
	private byte [] bankcheck;
	public int getDocumentid() {
		return documentid;
	}
	public void setDocumentid(int documentid) {
		this.documentid = documentid;
	}
	public byte[] getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(byte[] addressProof) {
		this.addressProof = addressProof;
	}
	public byte[] getBankStatement() {
		return bankStatement;
	}
	public void setBankStatement(byte[] bankStatement) {
		this.bankStatement = bankStatement;
	}
	public byte[] getSalarySleep() {
		return salarySleep;
	}
	public void setSalarySleep(byte[] salarySleep) {
		this.salarySleep = salarySleep;
	}
	public byte[] getThumb() {
		return thumb;
	}
	public void setThumb(byte[] thumb) {
		this.thumb = thumb;
	}
	public byte[] getBankcheck() {
		return bankcheck;
	}
	public void setBankcheck(byte[] bankcheck) {
		this.bankcheck = bankcheck;
	}
	@Override
	public String toString() {
		return "Customer [documentid=" + documentid + ", adharCard=" + Arrays.toString(adharCard) + ", panCard="
				+ Arrays.toString(panCard) + ", photo=" + Arrays.toString(photo) + ", signature="
				+ Arrays.toString(signature) + ", addressProof=" + Arrays.toString(addressProof) + ", bankStatement="
				+ Arrays.toString(bankStatement) + ", salarySleep=" + Arrays.toString(salarySleep) + ", thumb="
				+ Arrays.toString(thumb) + ", bankcheck=" + Arrays.toString(bankcheck) + "]";
	}	
	
}
