package be_study.api.test;

public class VilageDTO {
	String baseDate;
	String baseTime;
	String fcstDate;
	String fcstTime;
	String category;
	
	public String getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}
	public String getBaseTime() {
		return baseTime;
	}
	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}
	public String getFcstDate() {
		return fcstDate;
	}
	public void setFcstDate(String fcstDate) {
		this.fcstDate = fcstDate;
	}
	public String getFcstTime() {
		return fcstTime;
	}
	public void setFcstTime(String fcstTime) {
		this.fcstTime = fcstTime;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFcstValue() {
		return fcstValue;
	}
	public void setFcstValue(String fcstValue) {
		this.fcstValue = fcstValue;
	}
	String fcstValue;

	@Override
	public String toString() {
		return "VilageDTO [baseDate=" + baseDate + ", baseTime=" + baseTime + ", fcstDate=" + fcstDate + ", fcstTime="
				+ fcstTime + ", category=" + category + ", fcstValue=" + fcstValue + "]";
	}
	
}