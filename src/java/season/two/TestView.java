package java.season.two;

import java.util.Scanner;

public class TestView {

	public static void main(String[] args)
	{
		Vehicle[] rentVehicle = {new PassengerCar(1,"奥迪A4",500,4),
								new PassengerCar(2,"马自达6",400,4),
								new Pickup(3,"皮卡雪",450,4,2),
								new PassengerCar(4,"金龙 ",800,20),
								new Truck(5,"松花江",400,4),
								new Truck(6,"依维柯",1000,20)};

		System.out.println("欢迎使用答答租车系统：\n您是否要租车：1是 O否");
		Scanner input = new Scanner(System.in);
		int num ,day;
		int[] nums = new int[6];
		while(true)
		{
			int in = input.nextInt();
			if(in==1){
				vehicleList(rentVehicle);//显示租车列表
				
				while(true){
					
					System.out.println("请输入您要租汽车的数量：");
					num = input.nextInt();
					if(num>0&&num<=rentVehicle.length){
						for (int i = 0; i <num; i++) {
							System.out.println("请输入第"+(i+1)+"辆车序号");
							nums[i]=input.nextInt();
						}
						System.out.println("请输入租车天数：");
						day =input.nextInt();
						
						System.out.println("*您的账单：\n***可载人的车有：");
						int mantotal=0,goodstotal=0,moneytotal=0;
						for (int i : nums) {
							if(i!=0){
								if(i<=4){
									System.out.print(rentVehicle[i-1].name+"\t");
									mantotal+=rentVehicle[i-1].containMan;
								}
							}
						}
						System.out.println("共载人："+mantotal+"人");
						System.out.println();
						System.out.println("***可货的车有：");
						for (int i : nums) {
							if(i!=0){
								if(i>4||i==3){
									System.out.print(rentVehicle[i-1].name+"\t");
									goodstotal+=rentVehicle[i-1].containGoods;
									
								}
								moneytotal+=rentVehicle[i-1].rent*day;
							}
						}
						System.out.println("共载货："+goodstotal+"吨"+"\n");
						System.out.println("***租车("+day+"天)总价格为："+moneytotal+"元");
						
						break;
					}else if(num>rentVehicle.length){
						
						System.out.println("已超出可租车型，请重新输入：");
					}else{
						System.out.println("您的输入有误，请重新输入：");
					}
					
				}
				
				break;
				
			}else if((in==0)) {
				System.out.println("再见...");
				break;
			}else {
				System.out.println("您的输入有误...请重新输入：");
			}
		}
		
	}//main方法结束
	
	
	
//	显示可租车价目表
	public static void vehicleList(Vehicle[] list)
	{
		System.out.println("您可租车的类型及其价目表：");
		System.out.println("序号 "+"\t汽车名称"+"\t租金"+"\t\t容量");
		for (Vehicle vehicle : list) {
			if (vehicle instanceof PassengerCar) {
				System.out.println(""+vehicle.order+".\t"+vehicle.name+"\t\t"+vehicle.rent+"元/天\t"+"载人："+vehicle.containMan+"人");
			}
			if (vehicle instanceof Pickup) {
				System.out.println(""+vehicle.order+".\t"+vehicle.name+"\t\t"+vehicle.rent+"元/天\t"+"载人："+vehicle.containMan+"人" +" "+vehicle.containGoods+"吨");
			}
			if (vehicle instanceof Truck) {
				System.out.println(""+vehicle.order+".\t"+vehicle.name+"\t\t"+vehicle.rent+"元/天\t"+"载货："+vehicle.containGoods+"吨");
			}
			
		}
		
	}
	
	
//请输入您要租汽车的数量
	public static int[] chooseVehicle(Vehicle[] rentVehicle){
		
		int[] vehicleList = new int[rentVehicle.length];
		boolean m = true;
		int n=0;
		while(m){
			
			System.out.println("请输入您要租汽车的数量：");
			if(n<=rentVehicle.length){
				for (int i = 0; i < vehicleList.length; i++) {
					System.out.println("请输入第"+i+1+"辆车的序号：");
					vehicleList[i]=n;
//					break;
				}
//				m=false;
			}else if(n<=0){
					System.out.println("您的输入有误，请再次输入:");
			}else{
					System.out.println("您要租车数量已超出可租数量，请从新输入：");
			}
			
			
		}
		
		
		
		
		
		return null;
	}
	
	
	
}
