package cn.qdu.edu.rent;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.StringHolder;

public class Rent {
	
	
public static void main(String[] args) {
String str=null;
	Car car=new Car();
	Bus bus=new Bus();
	int j = 0,k=0;
	do{
	System.out.println("��ӭ��������˾�⳵ϵͳ����ѡ������Ҫ�ĳ��ͣ�");
	System.out.println("1.�γ�              2�ͳ�");
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	switch (n) {
	case 1:
	{   
		car.showtype();
		Scanner input1=new Scanner(System.in);
		int m=input1.nextInt();
		car.setType(m);
		car.carrent();
		car.carcost();
	}
		break;
case 2:
	{bus.showtype();	
	Scanner input1=new Scanner(System.in);
	int m=input1.nextInt();
	bus.setType(m);
	bus.busrent();
    bus.buscost();}
		break;
	default:
		System.out.println("ѡ������޴�ѡ��");
		break;
	}
	System.out.println("�Ƿ����ʹ�ñ�ϵͳ����y/n��");
	Scanner input2=new Scanner(System.in);
	str=input.next();
	}while("y".equals(str));
}
}
