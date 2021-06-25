package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("======= TEST 1: seller findById =======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n======= TEST 2: seller findByDepartament =======");
		Departament departament = new Departament(2, null);
		List<Seller> list = sellerDao.findByDepartament(departament);

		for (Seller i : list) {
			System.out.println(i);
		}

		System.out.println("\n======= TEST 3: seller findAll =======");
		list = sellerDao.findAll();
		for (Seller i : list) {
			System.out.println(i);
		}

		System.out.println("\n======= TEST 4: seller Insert =======");
		Seller newSeller = new Seller(null, "Livia", "livia@gmail.com", new Date(), 4000.0, departament);
		sellerDao.insert(newSeller);

		System.out.println("Inserted new id = " + newSeller.getId());
	}
}
