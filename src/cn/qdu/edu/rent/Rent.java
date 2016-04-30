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
	System.out.println("欢迎来到本公司租车系统，请选择您想要的车型：");
	System.out.println("1.轿车              2客车");
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
		System.out.println("选择错误，无此选项");
		break;
	}
	System.out.println("是否继续使用本系统？（y/n）");
	Scanner input2=new Scanner(System.in);
	str=input.next();
	}while("y".equals(str));
}
}
