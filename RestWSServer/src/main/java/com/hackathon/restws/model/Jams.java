package com.hackathon.restws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Jams")
@Entity
@Table(name = "jams")

public class Jams {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private long id;
	
	@Column(name="wid")
	private long wid;
	
	@Column(name="pid")
	private long pid;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="eid")
	private String eId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public long getWid() {
		return wid;
	}

	public void setWid(long wid) {
		this.wid = wid;
	}
}
