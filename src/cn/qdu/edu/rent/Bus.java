package cn.qdu.edu.rent;

import java.util.Scanner;

public class Bus extends Vehicle {
 
 private  int type=0;
 Vehicle vehicle=new Vehicle();
 public  void showtype(){
	 System.out.println("��ѡ������Ҫ�ĳ���");
	 System.out.println("1.<=16��" +
	  		"2.>16��" 
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
			System.out.println("�޴�ѡ�������ѡ��");
			break;
		}
	}
 public void buscost(){
	int cost1=0;
	if (type!=0) {
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
	
	default:
		System.out.println("�޴�ѡ�������ѡ��");
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
