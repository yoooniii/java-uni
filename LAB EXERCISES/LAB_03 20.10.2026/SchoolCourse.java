public abstract class SchoolCourse {
	protected String name;
	protected double gradeSum=0;
	protected int br=0;
	
 public SchoolCourse(String name) {
		this.name = name;
	}
 
public abstract void enroll(String studentName, int[] grades);
 public abstract double AvgGrade() ;
	 

}
