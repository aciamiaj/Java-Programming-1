import java.util.Scanner;

public class MainApp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Declare variables
			String studName, course;
			double assignScore1, assignScore2, assignScore3, assignScore4,  labScore1, labScore2, labScore3, labScore4, labScore5, assignTotal, labTotal;
			double testTotal, testScore1, testScore2, overallTot, overallPercent, assignPercent, labPercent, testPercent;
			
			Student stud = new Student();
			EvaluationItem eval = new EvaluationItem();
			
			//Initialize variables
			studName = stud.getstudName();
			course = stud.getCourse();
			overallTot = stud.getGrandTotal();
			overallPercent = stud.getoverallPercent();
			assignTotal = stud.getAssignTotal();
			assignPercent = stud.getassignPercent();
			labTotal = stud.getLabTotal();
			labPercent = stud.getlabPercent();
			testTotal = stud.getTestTotal();
			testPercent = stud.gettestPercent();
			
			//Create Scanner
			Scanner kbd = new Scanner(System.in);
			
			String answer; //To repeat if answer is yes
			
			do {	
				System.out.print("Enter assignment score 1: ");
				assignScore1 = kbd.nextDouble();
			
			if (assignScore1 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);
				   
			}
			
			else if (assignScore1 > 20) 
			{
				System.out.println("Maximum assignment score is 20.");
				System.exit(0);
			}
			
			else
				System.out.print("Enter assignment score 2: ");
				assignScore2 = kbd.nextDouble();
			
			if (assignScore2 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);
			}
			
			else if (assignScore2 > 20) 
			{
				System.out.println("Maximum assignment score is 20.");
				System.exit(0);	
			}
			
			else
				System.out.print("Enter assignment score 3: ");
				assignScore3 = kbd.nextDouble();
			
			if (assignScore3 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);	
			}
			
			else if (assignScore3 > 20) 
			{
				System.out.println("Maximum assignment score is 20.");
				System.exit(0);	
			}
			
			else 
				System.out.print("Enter assignment score 4: ");
				assignScore4 = kbd.nextDouble();
			
			if (assignScore4 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);	
			}
			
			else if (assignScore4 > 20) 
			{
				System.out.println("Maximum assignment score is 20.");
				System.exit(0);	
			}
			
			else
				System.out.println("====================================");
				System.out.print("Enter lab score 1: ");
				labScore1 = kbd.nextDouble();
			
			if (labScore1 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);	
			}
			
			else if (labScore1 > 10) 
			{
				System.out.println("Maximum lab score is 10.");
				System.exit(0);	
			}
			
			else
				System.out.print("Enter lab score 2: ");
				labScore2 = kbd.nextDouble();
			
			if (labScore2 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);		
			}
			
			else if (labScore2 > 10) 
			{
				System.out.println("Maximum lab score is 10.");
				System.exit(0);	
			}
			
			else
				System.out.print("Enter lab score 3: ");
				labScore3 = kbd.nextDouble();
			
			if (labScore3 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);	
			}
			
			else if (labScore3 > 10) 
			{
				System.out.println("Maximum lab score is 10.");
				System.exit(0);		
			}
			
			else
				System.out.print("Enter lab score 4: ");
				labScore4 = kbd.nextDouble();
			
			if (labScore4 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);	
			}
			
			else if (labScore4 > 10) 
			{
				System.out.println("Maximum lab score is 10.");
				System.exit(0);	
			}
			
			else
				System.out.print("Enter lab score 5: ");
				labScore5 = kbd.nextDouble();
			
			if (labScore5 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);	
			}
			
			else if (labScore5 > 10) 
			{
				System.out.println("Maximum lab score is 10.");
				System.exit(0);	
			}
			
			else
				System.out.println("====================================");
				System.out.print("Enter Mid-term score: ");
				testScore1 = kbd.nextDouble();
			
			if (testScore1 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);   	
			}
			
			else if (testScore1 > 100) 
			{
				System.out.println("Maximum mid-term score is 100.");
				System.exit(0);
			}
			
			else
				System.out.print("Enter Final score: ");
				testScore2 = kbd.nextDouble();
			
			if (testScore2 <= 0) 
			{
				System.out.println("Score should be greater than 0.");
				System.exit(0);
				    
			}	
			
			else if (testScore2 > 100) 
			{
				System.out.println("Maximum final score is 100.");
				System.exit(0);
			}
		    
				System.out.println("====================================");
				System.out.println();
						
				stud.setstudName(studName);
				stud.setCourse(course);	
				stud.setAssignment1(assignScore1);
				stud.setAssignment2(assignScore2);
				stud.setAssignment3(assignScore3);
				stud.setAssignment4(assignScore4);
				stud.setAssignTotal(assignTotal);
				stud.setassignPercent(assignPercent);
				stud.setLab1(labScore1);
				stud.setLab2(labScore2);
				stud.setLab3(labScore3);
				stud.setLab4(labScore4);
				stud.setLab5(labScore5);
				stud.setLabTotal(labTotal);
				stud.setlabPercent(labPercent);
				stud.setTest1(testScore1);
				stud.setTest2(testScore2);
				stud.setTestTotal(testTotal);
				stud.settestPercent(testPercent);
				stud.setGrandTotal(overallTot);
				stud.setoverallPercent(overallPercent);
				stud.printReportCard();
			
				System.out.println();
				System.out.println("Do you want to compute another set of grades? yes or no");
				answer = kbd.next();
	        } while (answer.equalsIgnoreCase("yes"));
			
			System.exit(0);
			kbd.close();
	}
}
		



	
