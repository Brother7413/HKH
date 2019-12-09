package pcg2;
import java.util.List;
public class Student {
	private String stuname;
	private String stuid;
	private String gender;
	private List<Course> courses;
	
	public Student(String stuname,String stuid,String gender,List<Course> courses) {
		this.stuname=stuname;
		this.stuid=stuid;
		this.courses= courses;
		this.gender=gender;
	}
	public String getStuname() {
		return stuname;
	}
	public Void setStuname(String stuname) {
		this.stuname=stuname;
	}
	public String getStuid() {
		return stuid;
	}
	public Void setStuid(String stuid) {
		this.stuid=stuid;
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
