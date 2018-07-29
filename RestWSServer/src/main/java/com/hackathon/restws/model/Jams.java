package com.hackathon.restws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Jams")
public class Jams {
	
	private long id;
	private long wid;
	private long pid;
	private String remarks;
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
