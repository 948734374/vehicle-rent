package cn.qdu.edu.rent;

import java.util.Scanner;

public class Car extends Vehicle {
  private int type=0;
  Vehicle vehicle=new Vehicle();
  public  void showtype(){
	System.out.println("��ѡ������Ҫ�ĳ���");
	  System.out.println("1.�������" +
	  		"2.����550i" +
	  		"3.������ȴ��");
  }
  public void carrent() {
	  
	  switch (type) {
	case 1:
		vehicle.setRent(600);
		break;
case 2:
	vehicle.setRent(500);
		break;
case 3:
	vehicle.setRent(300);
	break;
	default:
		System.out.println("�޴�ѡ�������ѡ��");
		break;
	}
}
  public void carcost(){
	int cost1=0;
	System.out.println("������������������");
	Scanner input=new Scanner(System.in);
	int m=input.nextInt();
	switch (type) {
	case 1:
		{cost1=m*vehicle.getRent();
		vehicle.setCost(cost1);
		System.out.println("��������ǣ�"+
				vehicle.getCost());
		}
		break;
case 2:
	cost1=m*vehicle.getRent();
	vehicle.setCost(cost1);
	System.out.println("��������ǣ�"+
			vehicle.getCost());
		break;
case 3:
	cost1=m*vehicle.getRent();
	vehicle.setCost(cost1);
	System.out.println("��������ǣ�"+
			vehicle.getCost());
	break;
	default:
		System.out.println("�޴�ѡ�������ѡ��");
		break;
	}
	
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
}