package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
//import framework.ShopAcc;
import framework.ShopFactory;


public class GoShoppingApplicationClient {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(7547,"Manish Tanganiya ",570,true);
		NormalAcc n=new GSNormalAcc(6245,"Amit ",570,60);
		System.out.println("prime Account");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);

	}

}
