package be_study.quiz.quiz51;

public class MinuDustWeek {
//	int id;  DTO 테이블 PK id
	String presnatnDt;
	String frcstOneCn;
	String frcstTwoCn;
	String frcstOneDt;
	String frcstTwoDt;
	
	/*
	CREATE TABLE MINU_DUST_WEEK (
	    id NUMBER PRIMARY KEY,
	    presnatn_dt VARCHAR2(10),
		frcst_One_Cn VARCHAR2(4000),
		frcst_Two_Cn VARCHAR2(4000),
		frcst_One_Dt VARCHAR2(10),
		frcst_Two_Dt VARCHAR2(10)
	);
	
	CREATE SEQUENCE SEQ_MINU_DUST_WEEK_PK
	START WITH 1
	INCREMENT BY 1
	NOCYCLE;
	 */
	
	public String getPresnatnDt() {
		return presnatnDt;
	}
	public void setPresnatnDt(String presnatnDt) {
		this.presnatnDt = presnatnDt;
	}
	public String getFrcstOneCn() {
		return frcstOneCn;
	}
	public void setFrcstOneCn(String frcstOneCn) {
		this.frcstOneCn = frcstOneCn;
	}
	public String getFrcstTwoCn() {
		return frcstTwoCn;
	}
	public void setFrcstTwoCn(String frcstTwoCn) {
		this.frcstTwoCn = frcstTwoCn;
	}
	public String getFrcstOneDt() {
		return frcstOneDt;
	}
	public void setFrcstOneDt(String frcstOneDt) {
		this.frcstOneDt = frcstOneDt;
	}
	public String getFrcstTwoDt() {
		return frcstTwoDt;
	}
	public void setFrcstTwoDt(String frcstTwoDt) {
		this.frcstTwoDt = frcstTwoDt;
	}
	@Override
	public String toString() {
		return "MinuDustWeek [presnatnDt=" + presnatnDt + ", frcstOneCn=" + frcstOneCn + ", frcstTwoCn=" + frcstTwoCn
				+ ", frcstOneDt=" + frcstOneDt + ", frcstTwoDt=" + frcstTwoDt + "]";
	}
	
	
	
}
