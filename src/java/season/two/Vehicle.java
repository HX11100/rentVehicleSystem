package java.season.two;

public class Vehicle {
//序号  汽车名称    租金       容量
	public int order;
	public String name;
	public double rent;
//	public int day;
	public int containMan;
	public int containGoods;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vehicle(int order, String name, double rent) {
		super();
		this.order = order;
		this.name = name;
		this.rent = rent;
	}
	
}
