package com.academy.employees.main;

import com.academy.employees.bean.Adress;
import com.academy.employees.bean.Employee;
import com.academy.employees.bean.Manager;
import com.academy.employees.bean.Scientist;
import com.academy.employees.bean.Worker;
import com.academy.employees.utils.ManagerSearch;
import com.academy.employees.utils.ScientistSearch;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee manager1 = new Manager("AAA", 1, "ONE", 599);
		Employee manager2 = new Manager("vvv", 2, "2", 987);
		Employee manager3 = new Manager("www", 3, "3", 645);
		Employee manager4 = new Manager("hhh", 4, "4", 123);
		Employee manager5 = new Manager("jjj", 5, "5", 224);

		Employee worker1 = new Worker("1", 1);
		Employee worker2 = new Worker("2", 2);
		Employee worker3 = new Worker("3", 3);

		Employee scientist1 = new Scientist("rtt", 1, 23);
		Employee scientist2 = new Scientist("lol", 3, 28);
		Employee scientist3 = new Scientist("lll", 4, 96);
		Employee scientist4 = new Scientist("ef", 2, 153);

		Employee[] arrayEmployees = new Employee[12];
		arrayEmployees[0] = manager1;
		arrayEmployees[1] = manager2;
		arrayEmployees[2] = manager3;
		arrayEmployees[3] = manager4;
		arrayEmployees[4] = manager5;
		arrayEmployees[5] = worker1;
		arrayEmployees[6] = worker2;
		arrayEmployees[7] = worker3;
		arrayEmployees[8] = scientist1;
		arrayEmployees[9] = scientist2;
		arrayEmployees[10] = scientist3;
		arrayEmployees[11] = scientist4;

		ManagerSearch managerSearch = new ManagerSearch();
		Manager[] resultOfManagers = managerSearch.findManagersWithClubFees(arrayEmployees, 500);
		for (Manager manager : resultOfManagers) {
			System.out.println(manager);
		}

		ScientistSearch scientistSearch = new ScientistSearch();
		Scientist scientistWithMaxPub = scientistSearch.findScientistWithMaxPublications(arrayEmployees);
		System.out.println(scientistWithMaxPub);

		System.out.println(manager3);

		Manager clonedManager1 = (Manager) manager1.clone();
		clonedManager1.setClubFees(1000);
		System.out.println(manager1);
		System.out.println(clonedManager1);

		System.out.println("-----------------------");

		Adress adressForManager = new Adress("Blr", "Minsk", "Masherova");
		// Adress adressForCloneManager = new Adress("Blr", "Brest", "Lenina");
		Manager managerWithAdress = new Manager("www", 111, "erw", 999);
		managerWithAdress.setAdress(adressForManager);

		Manager clonedManWithAdress = managerWithAdress.clone();
		// clonedManWithAdress.setAdress(adressForCloneManager);

		managerWithAdress.setId(222222222);
		managerWithAdress.getAdress().setCity("AAAAAAAAAA");

		System.out.println(managerWithAdress);
		System.out.println(clonedManWithAdress);
		System.out.println("-----------------------");

	}
}
