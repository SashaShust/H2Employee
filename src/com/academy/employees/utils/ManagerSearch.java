package com.academy.employees.utils;

import com.academy.employees.bean.Employee;
import com.academy.employees.bean.Manager;

public class ManagerSearch {
	public Manager[] findManagersWithClubFees(Employee[] massEmployee, double clubFees) {
		Manager[] arrayManagers = new Manager[massEmployee.length];
		Manager[] resultArrayManagers = new Manager[arrayManagers.length];

		int i = 0;
		for (Employee employee : massEmployee) {
			if (employee instanceof Manager) {

				arrayManagers[i] = (Manager) employee;
				i++;
			}

		}
		int j = 0;
		for (Manager manager : arrayManagers) {
			if (manager != null) {
				if ((manager.getClubFees() > clubFees)) {

					resultArrayManagers[j] = manager;
					j++;
				}
			}
		}
		return resultArrayManagers;
	}
}
