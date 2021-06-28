package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Departament;

public class ProgramDepartment {

	public static void main(String[] args) {
		DepartamentDao departament = DaoFactory.createDepartmentDao();

		System.out.println("=== FIND BY ID ===");
		Departament dep = departament.findById(1);
		System.out.println(dep);

		System.out.println("=== FIND ALL ===");
		List<Departament> list = departament.findAll();

		for (Departament d : list) {
			System.out.println(d);
		}
		
		System.out.println("=== INSERT ===");
		Departament newDep = new Departament(null, "Music");
//		departament.insert(newDep);
		System.out.println("Departament crieted");
		
		System.out.println("=== Update ===");
		newDep = new Departament(6, "Drinks");
		departament.update(newDep);
		System.out.println("Departament updated");
		
		System.out.println("=== Update ===");
		departament.deleteById(6);
		System.out.println("Departament deleted");
	}

}
