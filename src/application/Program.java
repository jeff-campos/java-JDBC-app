package application;

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

		System.out.println("\n======= TEST 2: Seller findByDepartament =======");
		Departament departament = new Departament(2, null);
		List<Seller> list = sellerDao.findByDepartament(departament);

		for (Seller i : list) {
			System.out.println(i);
		}
	}

}
