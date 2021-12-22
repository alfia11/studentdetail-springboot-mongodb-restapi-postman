package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Student")
public class Student {
	@Id
private long id;
private String name;
private int birthdate;
private String classe;
private String division;
private String gender;
public Student() {
	super();
	
}
public Student(long id,String name, int birthdate, String classe, String division, String gender) {
	super();
	
	this.name = name;
	this.birthdate = birthdate;
	this.classe = classe;
	this.division = division;
	this.gender = gender;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBirthdate() {
	return birthdate;
}
public void setBirthdate(int birthdate) {
	this.birthdate = birthdate;
}
public String getClasse() {
	return classe;
}
public void setClasse(String classe) {
	this.classe = classe;
}
public String getDivision() {
	return division;
}
public void setDivision(String division) {
	this.division = division;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
