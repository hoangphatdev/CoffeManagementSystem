package ite.computer_management.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
	private int id;
	private String computerName;
	private String computerCode;
	private String brand;
	private String cpu;
	private int ram;
	private String vga;
	private Double screenSize;
	private Double price;
	private int quantity;
	private String computerType;
	private Double weight;
	private String origin;
	public Product() {}
	
	public Product(String computerName, String computerCode, String brand, Double price, String cpu, int ram, String vga,
			Double screenSize,  Double weight,String computerType,String origin, int quantity) {
		
		this.computerName = computerName;
		this.computerCode = computerCode;
		this.brand = brand;
		this.cpu = cpu;
		this.ram = ram;
		this.vga = vga;
		this.screenSize = screenSize;
		this.price = price;
		this.quantity = quantity;
		this.computerType = computerType;
		this.origin = origin;
		this.weight = weight;
	}

	public Product(int id, String computerName, String computerCode, String brand, String cpu, int ram, String vga,
			Double screenSize, Double price, int quantity, String computerType, Double weight, String origin) {
		
		this.id = id;
		this.computerName = computerName;
		this.computerCode = computerCode;
		this.brand = brand;
		this.cpu = cpu;
		this.ram = ram;
		this.vga = vga;
		this.screenSize = screenSize;
		this.price = price;
		this.quantity = quantity;
		this.computerType = computerType;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public String getComputerCode() {
		return computerCode;
	}
	public void setComputerCode(String computerCode) {
		this.computerCode = computerCode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getVga() {
		return vga;
	}
	public void setVga(String vga) {
		this.vga = vga;
	}
	public Double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getComputerType() {
		return computerType;
	}
	public void setComputerType(String computerType) {
		this.computerType = computerType;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", computerName=" + computerName + ", computerCode=" + computerCode + ", brand="
				+ brand + ", cpu=" + cpu + ", ram=" + ram + ", vga=" + vga + ", screenSize=" + screenSize + ", price="
				+ price + ", quantity=" + quantity + ", computerType=" + computerType + ", weight=" + weight + ", origin=" + origin
				+ "]";
	};
	
	
	

}
