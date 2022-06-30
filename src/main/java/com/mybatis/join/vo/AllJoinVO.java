package com.mybatis.join.vo;

public class AllJoinVO {
	
	private DepartmestsVO detpsVO;
	private EmployeesVO empsVO;
	private Job_HistoryVO jobhVO;
	private LocationVO locVO;
	public AllJoinVO() {
	}
	public DepartmestsVO getDetpsVO() {
		return detpsVO;
	}
	public void setDetpsVO(DepartmestsVO detpsVO) {
		this.detpsVO = detpsVO;
	}
	public EmployeesVO getEmpsVO() {
		return empsVO;
	}
	public void setEmpsVO(EmployeesVO empsVO) {
		this.empsVO = empsVO;
	}
	public Job_HistoryVO getJobhVO() {
		return jobhVO;
	}
	public void setJobhVO(Job_HistoryVO jobhVO) {
		this.jobhVO = jobhVO;
	}
	public LocationVO getLocVO() {
		return locVO;
	}
	public void setLocVO(LocationVO locVO) {
		this.locVO = locVO;
	}
	@Override
	public String toString() {
		return "AllJoinVO [detpsVO=" + detpsVO + ", empsVO=" + empsVO + ", jobhVO=" + jobhVO + ", locVO=" + locVO + "]";
	}
	

	
	
	
	
	

}
