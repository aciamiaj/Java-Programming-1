
public class EvaluationItem {

	private String itemName;
	private double maxScore, score;
	//private double assignment1, assignment2, assignment3, assignment4, lab1, lab2, lab3, lab4, lab5, test1, test2, assignTotal, labTotal;
	
	
	
	//Mutator methods
	public void setitemName(String newitemName) {
		itemName = newitemName;
	}
	
	public void setmaxScore(double newmaxScore) {
		maxScore = newmaxScore;
	}
	
	public void setScore(double newScore) {
		score = newScore;
	}
	
	//Accessor methods
	public String getitemName() {
		return itemName;
	}
	
	public double getmaxScore() {
		return maxScore;
	}
	
	public double getScore() {
		return score;
	}

	
	//Constructor - Default
	public EvaluationItem() {
		itemName = "TBA";
		maxScore=100;
		score = 1;		
	}	
	
}


