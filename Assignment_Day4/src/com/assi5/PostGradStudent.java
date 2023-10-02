package com.assi5;

public class PostGradStudent extends Student {
private int postCourseId;
private String postCourseName;
private int postCoursefees;
public int getPostCourseId() {
	return postCourseId;
}
public void setPostCourseId(int postCourseId) {
	this.postCourseId = postCourseId;
}
public String getPostCourseName() {
	return postCourseName;
}
public void setPostCourseName(String postCourseName) {
	this.postCourseName = postCourseName;
}
public int getPostCoursefees() {
	return postCoursefees;
}
public void setPostCoursefees(int postCoursefees) {
	this.postCoursefees = postCoursefees;
}
public PostGradStudent(int postCourseId, String postCourseName, int postCoursefees,int StudentId,char StudentType,String StudentName) {
	super(StudentId,StudentType,StudentName);
	this.postCourseId = postCourseId;
	this.postCourseName = postCourseName;
	this.postCoursefees = postCoursefees;
	
}











}
