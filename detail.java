package txtFile;

public class detail {
	String PolicyNo;
	String CostofPolicy;
	String DateofExp;
	String DateofAd;
	String DateofDischarge;
	String MedicalSpec;
	public String getPolicyNo() {
		return PolicyNo;
	}
	public void setPolicyNo(String policyNo) {
		PolicyNo = policyNo;
	}
	public String getCostofPolicy() {
		return CostofPolicy;
	}
	public void setCostofPolicy(String costofPolicy) {
		CostofPolicy = costofPolicy;
	}
	public String getDateofExp() {
		return DateofExp;
	}
	public void setDateofExp(String dateofExp) {
		DateofExp = dateofExp;
	}
	public String getDateofDischarge() {
		return DateofDischarge;
	}
	public void setDateofDischarge(String dateofDischarge) {
		DateofDischarge = dateofDischarge;
	}
	public String getMedicalSpec() {
		return MedicalSpec;
	}
	public void setMedicalSpec(String medicalSpec) {
		MedicalSpec = medicalSpec;
	}
	public String getDateofAd() {
		return DateofAd;
	}
	public void setDateofAd(String dateofAd) {
		DateofAd = dateofAd;
	}
	public detail(String PolicyNo,String CostofPolicy,String DateofExp,String DateofAd,String DateofDischarge,String MedicalSpec)
	{
		this.PolicyNo=PolicyNo;
		this.CostofPolicy=CostofPolicy;
		this.DateofExp=DateofExp;
		this.DateofAd=DateofAd;
		this.DateofDischarge=DateofDischarge;
		this.MedicalSpec=MedicalSpec;
	}
	public String toString()
	{
		return PolicyNo+" "+CostofPolicy+" "+DateofExp+" "+DateofAd+" "+DateofDischarge+" "+MedicalSpec;
	}
	
	

}
