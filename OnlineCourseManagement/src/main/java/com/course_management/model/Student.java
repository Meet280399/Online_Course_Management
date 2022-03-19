package com.course_management.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class Student is the Entity representing student table in database
 * 
 * @author Akhil Inamdar
 *
 */

@Entity
@Access(AccessType.FIELD)
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "student_id")
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentAddress;
	private long studentMobile;

	/**
	 * student default constructor
	 */
	public Student() {
		super();
	}

	/**
	 * student constructor with fields as parameters
	 * 
	 * @param studentId      the student Id
	 * @param firstName      the first name of student
	 * @param lastName       the last name of student
	 * @param studentEmail   the email of student
	 * @param studentAddress the address of student
	 * @param studentMobile  the mobile number of student
	 */
	public Student(int studentId, String studentName, String studentEmail, String studentAddress, long studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
		this.studentMobile = studentMobile;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * gets the student name
	 * 
	 * @return
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * setter for student name
	 * 
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
//				+ ", studentAddress=" + studentAddress + ", studentMobile=" + studentMobile + "]";
//	}

}
