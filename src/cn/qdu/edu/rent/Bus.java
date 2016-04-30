package cn.qdu.edu.rent;

import java.util.Scanner;

public class Bus extends Vehicle {
 
 private  int type=0;
 Vehicle vehicle=new Vehicle();
 public  void showtype(){
	 System.out.println("请选择您需要的车型");
	 System.out.println("1.<=16座" +
	  		"2.>16座" 
	  		);
 }
 public void busrent() {
		switch (type) {
		case 1:
			vehicle.setRent(800);
			break;
	case 2:
		vehicle.setRent(1500);
			break;
	
		default:
			System.out.println("无此选项，请重新选择");
			break;
		}
	}
 public void buscost(){
	int cost1=0;
	if (type!=0) {
	System.out.println("请输入您想租用天数");
	Scanner input=new Scanner(System.in);
	int m=input.nextInt(); 
	switch (type) {
	case 1:
		{cost1=m*vehicle.getRent();
		vehicle.setCost(cost1);
		System.out.println("您的租金是："+
				vehicle.getCost());
		}
		break;
case 2:
	cost1=m*vehicle.getRent();
	vehicle.setCost(cost1);
	System.out.println("您的租金是："+
			vehicle.getCost());	
	break;
	
	default:
		System.out.println("无此选项，请重新选择");
		break;}
	}
}

public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
}
