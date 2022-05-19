package dto;

import java.io.Serializable;

// 모델 클래스
// JSP: 자바빈즈 (getter/setter, 기본 생성자, Serializable)
public class Product implements Serializable{
	
	// 이거를 써줘야 JSP에서 쓸 수 있는 객체가 된다. 없어도 된다고 해서 주석 처리
	//private static final long serialVersionUID = -152607505256033689L;
	
	private String productId;
	private String name;
	private int unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInstock;
	private String condition;
	
	// 빈생성자
	//public Product() {};
	
	public Product(String productId, String name, int unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInstock() {
		return unitsInstock;
	}
	public void setUnitsInstock(long unitsInstock) {
		this.unitsInstock = unitsInstock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", description="
//				+ description + ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInstock="
//				+ unitsInstock + ", condition=" + condition + "]";
//	}
	
	
}