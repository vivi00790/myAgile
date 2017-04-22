package source;

import java.util.LinkedList;
import java.util.Scanner;

public class GradeSystem implements IGradeSystem {
	LinkedList<Grade> grades = new LinkedList<Grade>();
	float[] weights = new float[] { 0.1f, 0.1f, 0.1f, 0.3f, 0.4f };

	/**
	 * 
	 */
	public GradeSystem() {
	}

	/**
	 * @param id
	 * 	the student's id
	 * @return if the grades contains the id or not
	 */
	@Override
	public boolean containsId(String id) {
		return false;
	}

	/**
	 * @param id
	 * 	the student's id
	 * print the student's grade to sysout
	 */
	@Override
	public void showGrade(String id) {
	}

	/**
	 * @param id
	 * 	the student's id
	 * print the student's rank
	 */
	@Override
	public void showRank(String id) {
	}

	/**
	 * let user update the new weight
	 */
	@Override
	public void updateWeight() {
	}

	/**
	 * @param id
	 * @return the grade of the student
	 */
	@Override
	public Grade getGrade(String id) {
		return null;
	}
}
