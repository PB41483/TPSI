/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab31;

/**
 *
 * @author pb41483
 */
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private String groupId;

	
	
	
	private List<Double> grades = new ArrayList<>();

	
	public Student(String firstName, String lastName, String emailAddress) {
		super(firstName, lastName, emailAddress);
		
		
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void addGrade(double grade) {
		grades.add(grade);
	}
	
	public double getGradesAvarege() {
		double srednia2=0;
		int size = grades.size();
		if (size==0) return srednia2;
		for (int i=0;i<size;i++){
			srednia2=srednia2+grades.get(i);
		}
		srednia2=srednia2/size;
		
		
		return srednia2;
	}
}