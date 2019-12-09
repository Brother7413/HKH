package pcg2;
import java.util.*;
public class Teacher {
	private String teaname;
	private String teaid;
	private String gender;
	private List<Course> courses;
	
	public Teacher(String teaname,String teaid,String gender,List<Course> courses) {
		this.teaname=teaname;
		this.teaid=teaid;
		this.courses= courses;
		this.gender=gender;
	}
	public String getStuname() {
		return teaname;
	}
	public Void setTeaame(String teaname) {
		this.teaname=teaname;
	}
	public String getTeaid() {
		return teaid;
	}
	public Void setTeaid(String teaid) {
		this.teaid=teaid;
	}
	public String getGender() {
		return gender;
	}
	public Void setGender(String gender) {
		this.gender=gender;
	}
	public String getCourses() {
		return courses;
	}
	public Void setCourses(String courses) {
		this.courses=courses;
	}
}