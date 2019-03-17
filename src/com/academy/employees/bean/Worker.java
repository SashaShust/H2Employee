package com.academy.employees.bean;

public class Worker extends Employee {
	public static final double COEFFICIENT_FOR_WORKER = 1.5;

	public Worker(String name, int id) {
		super(name, id);
	}

	@Override
	public double countPension() {
		double pensionResult = MINIMUM_PENSION * COEFFICIENT_FOR_WORKER;
		return pensionResult;
	}

	@Override
	public Worker clone() throws CloneNotSupportedException {
		Worker clonedObj1 = (Worker) super.clone();
		return clonedObj1;
	}

}
