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
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Teacher extends Person {

	private String courseName;

	public Teacher(String firstName, String lastName, String emailAddress) {
		super(firstName, lastName, emailAddress);
		

	}
        
        

	public String getName() {
		return courseName;
	}

	public void setName(String courseName) {
		this.courseName = courseName;
	}

}