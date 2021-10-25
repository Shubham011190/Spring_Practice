package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Record {
	
	@Id
	private int recordId;
	private String recordName;
	
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getRecordName() {
		return recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}
	
	@Override
	public String toString() {
		return "Record [recordId=" + recordId + ", recordName=" + recordName + "]";
	}
	
	
	
	
}
