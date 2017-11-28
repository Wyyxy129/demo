package com.tc25.bean;

import java.util.Date;

public class DVD {
	
	private String dvdName;
	//DVD����
	private int dvdId;
	//DVD ID
	private Date dvdDate;
	//DVD���ʱ��
	private int dvdStatus;
	//DVD��ǰ״̬(�ڿ�/���/��ɾ��)
	private int dvdLendCount;
	//DVD�������(����DVD����ͳһ��ʾ)
	
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
