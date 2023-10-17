package onetooneSemester;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Studentnew")
public class Student {
@Id
@GeneratedValue
private int rollno;
private String name;
private String studentClass;

@OneToOne(cascade=CascadeType.ALL)
private Semester sem;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStudentClass() {
	return studentClass;
}
public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}

public Student( String name, String studentClass, Semester sem) {
	super();
	//this.rollno = rollno;
	this.name = name;
	this.studentClass = studentClass;
	this.sem = sem;
}
public Semester getSem() {
	return sem;
}
public void setSem(Semester sem) {
	this.sem = sem;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", studentClass=" + studentClass + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
