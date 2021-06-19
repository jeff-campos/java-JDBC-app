package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Departament dep = new Departament(1, "Books");
		Seller seller = new Seller(21, "BoB", "bob@gmail.com", new Date(), 3000.0, dep);
		
		System.out.println(seller);
	}

}
