public class Informatics extends SchoolCourse{

	public Informatics() {
		super("Информатика");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enroll(String studentName, int[] grades) {
		for (int i = 0; i < grades.length; i++) {
		    gradeSum += grades[i];
		    br++;
		}
	}

	@Override
	public double AvgGrade() {
		return gradeSum/br;
	}

}
