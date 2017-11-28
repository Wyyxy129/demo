package com.tc25.bean;

import java.util.Date;

public class DVD {
	
	private String dvdName;
	//DVD名称
	private int dvdId;
	//DVD ID
	private Date dvdDate;
	//DVD入库时间
	private int dvdStatus;
	//DVD当前状态(在库/借出/已删除)
	private int dvdLendCount;
	//DVD借出次数(根据DVD名称统一显示)
	
	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	public int getDvdId() {
		return dvdId;
	}

	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}

	public Date getDvdDate() {
		return dvdDate;
	}

	public void setDvdDate(Date dvdDate) {
		this.dvdDate = dvdDate;
	}

	public int getDvdStatus() {
		return dvdStatus;
	}

	public void setDvdStatus(int dvdStatus) {
		this.dvdStatus = dvdStatus;
	}

	public int getDvdLendCount() {
		return dvdLendCount;
	}

	public void setDvdLendCount(int dvdLendCount) {
		this.dvdLendCount = dvdLendCount;
	}

	public DVD() {
		super();
	}

	public DVD(String dvdName, int dvdId, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdId = dvdId;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	
	public DVD(String dvdName, Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}

	@Override
	public String toString() {
		return "DVD [dvdName=" + dvdName + ", dvdId=" + dvdId + ", dvdDate=" + dvdDate + ", dvdStatus=" + dvdStatus
				+ ", dvdLendCount=" + dvdLendCount + "]";
	}

	
	
	
}
