class Math extends SchoolCourse {
    public Math() {
        super("Математика");
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
