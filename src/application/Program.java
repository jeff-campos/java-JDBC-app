package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
//		sellerDao.insert(newSeller);

		System.out.println("Inserted new id = " + newSeller.getId());

		System.out.println("\n======= TEST 5: seller update =======");
		seller = sellerDao.findById(8);
		seller.setName("Mano dot Slow");

		sellerDao.update(seller);
		System.out.println("Updeted id !!");

		System.out.println("\n======= TEST 6: seller delete =======");
		System.out.println("enter id for delete teste: ");
		int userId = sc.nextInt();

		sellerDao.deleteById(userId);
		System.out.println("Deleted id !!");

		sc.close();
	}
}
