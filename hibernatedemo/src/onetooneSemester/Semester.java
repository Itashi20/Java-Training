package onetooneSemester;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Semester {
	@Id
	@GeneratedValue
private int semid;
private double duration;
private int noofStudents;
public int getSemid() {
	return semid;
}
public void setSemid(int semid) {
	this.semid = semid;
}
public double getDuration() {
	return duration;
}
public void setDuration(double duration) {
	this.duration = duration;
}
public int getNoofStudents() {
	return noofStudents;
}
public void setNoofStudents(int noofStudents) {
	this.noofStudents = noofStudents;
}
@Override
public String toString() {
	return "Semester [semid=" + semid + ", duration=" + duration + ", noofStudents=" + noofStudents + "]";
}
public Semester(double duration, int noofStudents) {
	super();
	//this.semid = semid;
	this.duration = duration;
	this.noofStudents = noofStudents;
}
public Semester() {
	super();
	// TODO Auto-generated constructor stub
}

}
