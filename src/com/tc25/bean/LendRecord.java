package com.tc25.bean;

import java.util.Date;

public class LendRecord implements Comparable {
	private int lrId;
	//�����¼Id
	private String lrNumber;
	//�����¼����AA+4�������+dvdId(������λ����)  1  001 
	private int dvdId;
	//DVDID
	private String dvdName;
	//DVD����
	private Date lenDate;
	//���ʱ��(Ĭ���Դ�������Ȼ����)
	private Date retuDate;
	//Ԥ�ƹ黹ʱ��
	private int userId;
	//����û�ID
	private boolean lrStatus;
	//�����¼��״̬,��ǰ���ŵ��ݵ�״̬.
	public int getLrId() {
		return lrId;
	}
	public void setLrId(int lrId) {
		this.lrId = lrId;
	}
	public String getLrNumber() {
		return lrNumber;
	}
	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public Date getLenDate() {
		return lenDate;
	}
	public void setLenDate(Date lenDate) {
		this.lenDate = lenDate;
	}
	public Date getRetuDate() {
		return retuDate;
	}
	public void setRetuDate(Date retuDate) {
		this.retuDate = retuDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isLrStatus() {
		return lrStatus;
	}
	public void setLrStatus(boolean lrStatus) {
		this.lrStatus = lrStatus;
	}
	public LendRecord(int lrId, String lrNumber, int dvdId, String dvdName, Date lenDate, Date retuDate, int userId,
			boolean lrStatus) {
		super();
		this.lrId = lrId;
		this.lrNumber = lrNumber;
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.lenDate = lenDate;
		this.retuDate = retuDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}
	public LendRecord( String lrNumber, String dvdName, Date lenDate, Date retuDate,
			boolean lrStatus) {
		super();
		this.lrNumber = lrNumber;
		this.dvdName = dvdName;
		this.lenDate = lenDate;
		this.retuDate = retuDate;
		this.lrStatus = lrStatus;
	}
	
	public LendRecord() {
		super();
	}
	@Override
	public String toString() {
		return "LendRecord [lrId=" + lrId + ", lrNumber=" + lrNumber + ", dvdId=" + dvdId + ", dvdName=" + dvdName
				+ ", lenDate=" + lenDate + ", retuDate=" + retuDate + ", userId=" + userId + ", lrStatus=" + lrStatus
				+ "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
