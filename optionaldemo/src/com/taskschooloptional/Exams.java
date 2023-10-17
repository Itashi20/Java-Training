package com.taskschooloptional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Exams {
private String examName;
private String subject;
private LocalDate dateofexam;
//private Optional<ArrayList<Students>>student;
private List<Optional<Students>> student;
public String getExamName() {
	return examName;
}
public void setExamName(String examName) {
	this.examName = examName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public LocalDate getDateofexam() {
	return dateofexam;
}
public void setDateofexam(LocalDate dateofexam) {
	this.dateofexam = dateofexam;
}
public List<Optional<Students>> getStudent() {
	return student;
}
public void setStudent(List<Optional<Students>> student) {
	this.student = student;
}
@Override
public String toString() {
	return "Exams [examName=" + examName + ", subject=" + subject + ", dateofexam=" + dateofexam + ", student="
			+ student + "]";
}
public Exams(String examName, String subject, LocalDate dateofexam, List<Optional<Students>> student) {
	super();
	this.examName = examName;
	this.subject = subject;
	this.dateofexam = dateofexam;
	this.student = student;
}
public Exams() {
	super();
	// TODO Auto-generated constructor stub
}



}