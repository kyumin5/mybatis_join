package com.mybatis.join.vo;

public class DepartmestsVO {
	
	private int department_id  ;
	private String department_name;
	private String manager_id  ;
	private String location_id  ;
	public DepartmestsVO() {
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	@Override
	public String toString() {
		return "DepartmestsVO [department_id=" + department_id + ", department_name=" + department_name
				+ ", manager_id=" + manager_id + ", location_id=" + location_id + "]";
	}
	
	
	
	
	
	
	
	
}
