package com.academy.employees.utils;

import com.academy.employees.bean.Employee;
import com.academy.employees.bean.Scientist;

public class ScientistSearch {
	public Scientist findScientistWithMaxPublications(Employee[] massEmployee) {

		Scientist[] arrayScientist = new Scientist[massEmployee.length];

		arrayScientist = searchEmployeeByScientist(massEmployee);

		Scientist[] arrayScientist1 = findArrayScientist(arrayScientist);

		Scientist maxScientist = findScientistByPublications(arrayScientist1);

		return maxScientist;

	}

	private Scientist[] searchEmployeeByScientist(Employee[] massEmployee) {
		Scientist[] arrayScientist = new Scientist[massEmployee.length];

		int i = 0;
		for (Employee employee : massEmployee) {
			if ((employee != null) && (employee instanceof Scientist)) {
				arrayScientist[i] = (Scientist) employee;
				i++;
			}
		}
		return arrayScientist;
	}

	private Scientist[] findArrayScientist(Scientist[] arrayScientists) {
		int length = calculateRealLength(arrayScientists);
		Scientist[] arrayScientist1 = new Scientist[length];

		for (int j = 0; j < length; j++) {
			arrayScientist1[j] = arrayScientists[j];
		}
		return arrayScientist1;

	}

	private int calculateRealLength(Scientist[] arrayScientists) {
		int length = 0;
		for (Scientist scientist : arrayScientists) {
			if (scientist != null) {
				length++;
			}
		}
		return length;
	}

	private Scientist findScientistByPublications(Scientist[] arrayScientist1) {
		int indexScientist = 0;
		Scientist max = arrayScientist1[0];
		for (int j = 0; j < arrayScientist1.length; j++) {
			if (arrayScientist1[j] != null && arrayScientist1[j].getPublications() > max.getPublications()) {
				max = arrayScientist1[j];
				indexScientist = j;
			}
		}
		return arrayScientist1[indexScientist];

	}
}
