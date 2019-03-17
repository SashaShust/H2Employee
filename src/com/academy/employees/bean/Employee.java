package com.academy.employees.bean;

public abstract class Employee implements Cloneable {
	public static final double MINIMUM_PENSION = 500;
	private String name;
	private int id;
	private Adress adress;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, Adress adress) {
		super();
		this.name = name;
		this.id = id;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public abstract double countPension();

	@Override
	public String toString() {
		if (adress != null) {
			return "Employee [name=" + name + ", id=" + id + adress.toString() + "]";
		} else {
			return "Employee [name=" + name + ", id=" + id + "]";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee clonedObj1 = (Employee) super.clone();
		if (adress != null) {
			clonedObj1.adress = this.adress.clone();
		}
		return clonedObj1;
	}
}
