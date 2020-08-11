package co.kr.mono.training.vo;

import java.sql.Timestamp;
import java.util.Date;

public class SimpleVO {
	private String currentStrDate;
	private java.util.Date		utilCurrentDate;
	private java.sql.Date		sqlCurrentDate;
	private java.sql.Timestamp	sqlCurrentTimeStamp;
	private java.sql.Timestamp	sqlDbCurrentTimeStamp;
	
	public SimpleVO() {
	}

	public SimpleVO(String currentStrDate, Date utilCurrentDate, java.sql.Date sqlCurrentDate,
			Timestamp sqlCurrentTimeStamp, Timestamp sqlDbCurrentTimeStamp) {
		super();
		this.currentStrDate = currentStrDate;
		this.utilCurrentDate = utilCurrentDate;
		this.sqlCurrentDate = sqlCurrentDate;
		this.sqlCurrentTimeStamp = sqlCurrentTimeStamp;
		this.sqlDbCurrentTimeStamp = sqlDbCurrentTimeStamp;
	}

	public String getCurrentStrDate() {
		return currentStrDate;
	}

	public void setCurrentStrDate(String currentStrDate) {
		this.currentStrDate = currentStrDate;
	}

	public java.util.Date getUtilCurrentDate() {
		return utilCurrentDate;
	}

	public void setUtilCurrentDate(java.util.Date utilCurrentDate) {
		this.utilCurrentDate = utilCurrentDate;
	}

	public java.sql.Date getSqlCurrentDate() {
		return sqlCurrentDate;
	}

	public void setSqlCurrentDate(java.sql.Date sqlCurrentDate) {
		this.sqlCurrentDate = sqlCurrentDate;
	}

	public java.sql.Timestamp getSqlCurrentTimeStamp() {
		return sqlCurrentTimeStamp;
	}

	public void setSqlCurrentTimeStamp(java.sql.Timestamp sqlCurrentTimeStamp) {
		this.sqlCurrentTimeStamp = sqlCurrentTimeStamp;
	}

	public java.sql.Timestamp getSqlDbCurrentTimeStamp() {
		return sqlDbCurrentTimeStamp;
	}

	public void setSqlDbCurrentTimeStamp(java.sql.Timestamp sqlDbCurrentTimeStamp) {
		this.sqlDbCurrentTimeStamp = sqlDbCurrentTimeStamp;
	}
	
	
}
