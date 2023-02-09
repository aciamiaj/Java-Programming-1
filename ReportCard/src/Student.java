
public class Student {
	
	//Declare Variables
    private String studName, course;
    private double assignScore1, assignScore2, assignScore3, assignScore4, labScore1, labScore2, labScore3, labScore4, labScore5;
	private double assignTotal, labTotal, testTotal, testScore1, testScore2, assignPercent, labPercent, testPercent, overallPercent, overallTot;
	
	
	//Mutator methods
	public void setstudName(String newstudName) {
		studName = newstudName;
	}
	
	public void setCourse(String newCourse) {
		 course = newCourse;
	}
	
	public void setLab1(double newLab1) {
		labScore1 = newLab1;
	}
	
	public void setLab2(double newLab2) {
		labScore2 = newLab2;
	}
	
	public void setLab3(double newLab3) {
		labScore3 = newLab3;
	}
	
	public void setLab4(double newLab4) {
		labScore4 = newLab4;
	}
	
	public void setLab5(double newLab5) {
		labScore5 = newLab5;
	}
	
	public void setAssignment1(double newAssignment1) {
		assignScore1 = newAssignment1;
	}
	
	public void setAssignment2(double newAssignment2) {
		assignScore2 = newAssignment2;
	}
	
	public void setAssignment3(double newAssignment3) {
		assignScore3= newAssignment3;
	}
	
	public void setAssignment4(double newAssignment4) {
		assignScore4 = newAssignment4;
	}
	
	public void setTest1(double newTest1) {
		testScore1 = newTest1;
	}
	
	public void setTest2(double newTest2) {
		testScore2 = newTest2;
	}
	
	public void setAssignTotal(double newAssignTotal) {
		assignTotal = newAssignTotal;
	}
	
	public void setLabTotal(double newLabTotal) {
		labTotal = newLabTotal;
	}
	
	public void setassignPercent(double newassignPercent) {
		assignPercent = newassignPercent;
	}
	
	public void setlabPercent(double newlabPercent) {
		labPercent = newlabPercent;
	}
	
	public void settestPercent(double newtestPercent) {
		testPercent = newtestPercent;
	}

	public void setTestTotal(double newTestTotal) {
		testTotal = newTestTotal;
	}
	
	public void setGrandTotal(double newGrandTotal) {
		overallTot = newGrandTotal;
	}
	
	public void setoverallPercent(double newoverallPercent) {
		overallPercent = newoverallPercent;
	}
	
	//Accessor Methods
	
	public String getstudName() {
		return studName;
	}
	
	public String getCourse() {
		return course;
	}
	
	public double getLab1() {
		return labScore1;
	}
	
	public double getLab2() {
		return labScore2;
	}
	
	public double getLab3() {
		return labScore3;
	}
	
	public double getLab4() {
		return labScore4;
	}
	
	public double getLab5() {
		return labScore5;
	}
	
	public double getAssignment1() {
		return assignScore1;
	}
	
	public double getAssignment2() {
		return assignScore2;
	}
	
	public double getAssignment3() {
		return assignScore3;
	}
	
	public double getAssignment4() {
		return assignScore4;
	}
		
	
	public double getTest1() {
		return testScore1;
	}
	
	public double getTest2() {
		return testScore2;
	}
	
	public double getAssignTotal () {
		return assignTotal = (assignScore1 + assignScore2 + assignScore3 + assignScore4);
	}
	
	public double getLabTotal () {
		return labTotal = (labScore1 + labScore2 + labScore3 + labScore4 + labScore5);
	}
	
	public double getTestTotal () {
		return testTotal = (testScore1 + testScore2);
	}
	
	public double getassignPercent () {
		return assignPercent = (assignTotal / 80) * 100;
	}
	
	public double getlabPercent () {
		return labPercent = (labTotal / 50) * 100;
	}
	
	public double gettestPercent () {
		return testPercent = (testTotal / 200) * 100;
	}
	
	public double getGrandTotal () {
		return overallTot = (assignTotal + labTotal + testTotal);
	}
	
	public double getoverallPercent() {
		return overallPercent = (overallTot / 330) * 100;	
	}
	
	//Constructor - Default
	public Student() {
		studName = "Jaimaica Daisy Eugenio";
		course ="Java Programming 1";
	}
	
	//Print Report Card
	public void printReportCard() {
		System.out.printf("Student name: %s\n", getstudName());
		System.out.printf("Course: %s\n", getCourse());
		System.out.println("====================================");
		System.out.println("Assignment");
		System.out.println("------------------------------------");
		System.out.printf("Assignment 1: %.2f", getAssignment1()); System.out.println("/20");
		System.out.printf("Assignment 2: %.2f", getAssignment2()); System.out.println("/20");
		System.out.printf("Assignment 3: %.2f", getAssignment3()); System.out.println("/20");
		System.out.printf("Assignment 4: %.2f", getAssignment4()); System.out.println("/20");
		System.out.printf("Assignment Total: %.2f", getAssignTotal()); System.out.println("/80");
		System.out.printf("Assignment Percentage: %.2f", getassignPercent()); System.out.println("%");
		System.out.println("====================================");
		System.out.println("Labs");
		System.out.println("------------------------------------");
		System.out.printf("Lab 1: %.2f", getLab1()); System.out.println("/10");
		System.out.printf("Lab 2: %.2f", getLab2()); System.out.println("/10");
		System.out.printf("Lab 3: %.2f", getLab3()); System.out.println("/10");
		System.out.printf("Lab 4: %.2f", getLab4()); System.out.println("/10");
		System.out.printf("Lab 5: %.2f", getLab5()); System.out.println("/10");
		System.out.printf("Lab Total: %.2f", getLabTotal()); System.out.println("/50");
		System.out.printf("Lab Percentage: %.2f", getlabPercent()); System.out.println("%");
		System.out.println("====================================");
		System.out.println("Exams");
		System.out.println("------------------------------------");
		System.out.printf("Mid-term: %.2f", getTest1()); System.out.println("/100");
		System.out.printf("Final: %.2f", getTest2()); System.out.println("/100");
		System.out.printf("Exam Total: %.2f", getTestTotal()); System.out.println("/200");
		System.out.printf("Exam Percentage: %.2f", gettestPercent()); System.out.println("%");
		System.out.println("====================================");
		System.out.printf("Grand Total: %.2f", getGrandTotal()); System.out.println("/330");
		System.out.printf("Overall Percentage: %.2f", getoverallPercent()); System.out.println("%");
		System.out.println("------------------------------------");
			
		
		
	}
}

