package java.season.two;

public class Pickup extends Vehicle {

//	public int containMan;
//	public int containGoods;
	public Pickup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pickup(int order, String name, double rent,int containMan,int containGoods) {
		super(order, name, rent);
		this.containMan=containMan;
		this.containGoods=containGoods;
		
		
	}
	
	
	
}
