package com.mybatis.join.vo;

public class Spring_JoinVO {
	
	private Spring_DepartmentVO spring_dept;
	private Spring_EmploymentVO spring_emp;
	
	public Spring_JoinVO() {
	}

	public Spring_DepartmentVO getSpring_dept() {
		return spring_dept;
	}

	public void setSpring_dept(Spring_DepartmentVO spring_dept) {
		this.spring_dept = spring_dept;
	}

	public Spring_EmploymentVO getSpring_emp() {
		return spring_emp;
	}

	public void setSpring_emp(Spring_EmploymentVO spring_emp) {
		this.spring_emp = spring_emp;
	}

	@Override
	public String toString() {
		return "Spring_JoinVO [spring_dept=" + spring_dept + ", spring_emp=" + spring_emp + "]";
	}
	
	
	
	

}
