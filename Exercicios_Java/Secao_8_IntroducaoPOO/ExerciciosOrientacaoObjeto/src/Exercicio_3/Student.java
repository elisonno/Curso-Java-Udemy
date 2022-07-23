package Exercicio_3;

public class Student {
	String name;
	double note_1, note_2, note_3;
	
	public double finalGrade() {
		return note_1 + note_2 + note_3;
	}
	
	public String approved() {
		return (finalGrade() >= 60) ? "PASS" : "FAILED\n" + "MISSING " + (60 - finalGrade()) + " POINTS";
	}
	
	public String toString() {
		return "Final Grade = " + String.format("%.2f", finalGrade()) + "\n" + approved();
	}

}
