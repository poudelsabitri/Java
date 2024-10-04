package com.first.entity;

public class Student {
	private int student_id;
	private String student_name;
	private String course;
	private String first_name;
	private String last_name;
	private String add_line1;
	private String add_line2;
	private String city;
	private String state;
	private int pin;
	private long mobile_number;
	private String email_id;
	
	public Student() {}
	
	public Student(int student_id, String student_name, String course, String first_name, String last_name,
			String add_line1, String add_line2, String city, String state, int pin, long mobile_number,
			String email_id) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.course = course;
		this.first_name = first_name;
		this.last_name = last_name;
		this.add_line1 = add_line1;
		this.add_line2 = add_line2;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.mobile_number = mobile_number;
		this.email_id = email_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAdd_line1() {
		return add_line1;
	}
	public void setAdd_line1(String add_line1) {
		this.add_line1 = add_line1;
	}
	public String getAdd_line2() {
		return add_line2;
	}
	public void setAdd_line2(String add_line2) {
		this.add_line2 = add_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "StudentEntity [student_id=" + student_id + ", student_name=" + student_name + ", course=" + course
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", add_line1=" + add_line1
				+ ", add_line2=" + add_line2 + ", city=" + city + ", state=" + state + ", pin=" + pin
				+ ", mobile_number=" + mobile_number + ", email_id=" + email_id + "]";
	}
	
	

	
   

}
