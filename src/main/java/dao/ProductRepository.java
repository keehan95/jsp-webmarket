package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;

public class ProductRepository {
	
	// ArrayList는 클래스고 List는 인터페이스다. 앞에 ArrayList 말고 List를 써야 뒤에 링크드리스트든 어레이리스트든 쓸 수 있다.
	private List<Product> products = new ArrayList<>();
	
	// 원래는 DB에서 가져올 데이터
	// 지금 DB 안 배워서
	public ProductRepository() {
		Product phone = new Product("P1234", "iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1234X750 Retina HD display, 어쩌구");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInstock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1234", "iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1234X750 Retina HD display, 어쩌구");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("LG");
		phone.setUnitsInstock(1000);
		phone.setCategory("Refubished");
		
		Product tablet = new Product("P1234", "iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1234X750 Retina HD display, 어쩌구");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Samsung");
		phone.setUnitsInstock(1000);
		phone.setCategory("Old");
		
		products.add(phone);
		products.add(notebook);
		products.add(tablet);
	}
	
	// 모든 상품 정보를 가져온다.
	public List<Product> getAllProducts() {
		return products;
	}
}
