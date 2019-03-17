package com.academy.employees.bean;

public class Scientist extends Employee {
	public static final double COEFFICIENT_FOR_SCIENTIST = 1.8;

	private int publications;

	public Scientist(String name, int id, int publications) {
		super(name, id);
		this.publications = publications;
	}

	public int getPublications() {
		return publications;
	}

	public void setPublications(int publications) {
		this.publications = publications;
	}

	@Override
	public double countPension() {
		double pensionResult = MINIMUM_PENSION * COEFFICIENT_FOR_SCIENTIST;
		return pensionResult;
	}

	@Override
	public String toString() {
		return "Scientist [publications=" + publications + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + publications;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scientist other = (Scientist) obj;
		if (publications != other.publications)
			return false;
		return true;
	}

	@Override
	public Scientist clone() throws CloneNotSupportedException {
		Scientist clonedObj1 = (Scientist) super.clone();
		return clonedObj1;
	}

}
