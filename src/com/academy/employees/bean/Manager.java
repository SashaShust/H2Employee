package com.academy.employees.bean;

public class Manager extends Employee {
	public static final double COEFFICIENT_FOR_MANAGER = 1.0;

	private String position;
	private double clubFees;

	public Manager(String name, int id, String position, double clubFees) {
		super(name, id);
		this.position = position;
		this.clubFees = clubFees;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getClubFees() {
		return clubFees;
	}

	public void setClubFees(double clubFees) {
		this.clubFees = clubFees;
	}

	@Override
	public double countPension() {
		double pensionResult = MINIMUM_PENSION * COEFFICIENT_FOR_MANAGER;
		return pensionResult;
	}

	@Override
	public String toString() {
		return "Manager [" + super.toString() + "position=" + position + ", clubFees=" + clubFees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(clubFees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((position == null) ? 0 : position.hashCode());
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
		Manager other = (Manager) obj;
		if (Double.doubleToLongBits(clubFees) != Double.doubleToLongBits(other.clubFees))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

	@Override
	public Manager clone() throws CloneNotSupportedException {
		Manager clonedObg1 = (Manager) super.clone();
		return clonedObg1;
	}

}
