package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class employee {
	
	private String name;
	private List<String> phone;
	private Set<String> address;
	private Map<String,String> course;
	private Properties add_prop;
	private Properties util_proProperties;
	public employee(String name, List<String> phone, Set<String> address, Map<String, String> course,
			Properties add_prop,Properties util_proProperties) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
		this.add_prop = add_prop;
		this.util_proProperties=util_proProperties;
	}
	public Properties getUtil_proProperties() {
		return util_proProperties;
	}
	public void setUtil_proProperties(Properties util_proProperties) {
		this.util_proProperties = util_proProperties;
	}
	public Properties getAdd_prop() {
		return add_prop;
	}
	public void setAdd_prop(Properties add_prop) {
		this.add_prop = add_prop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "employee [name=" + name + ", phone=" + phone + ", address=" + address + ", course=" + course
				+ ", add_prop=" + add_prop + "+, util_properties="+util_proProperties+"]";
	}


}
