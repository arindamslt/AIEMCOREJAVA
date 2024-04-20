package JDBC;

import java.util.Scanner;

public class Menu {
//int option=0;
Scanner sc;
Food fd;
public void menuItem()
{
	sc=new Scanner(System.in);
	System.out.println("1.ADD FOOD 2.FOOD LIST 3.DELETE FOOD 4.UPDATE FOOD 5.EXIT=====");
    int option=sc.nextInt();
     fd=new Food();
     while(option!=5)
     {
     switch(option) {
     case 1:
    	 fd.addData();
    	 break;
     case 2:
    	 fd.getData();
    	 break;
     case 3:
    	 fd.deleteData();
    	 break;
     case 4:
    	 fd.updateData();
    	 break;
     }
     System.out.println("1.ADD FOOD 2.FOOD LIST 3.DELETE FOOD 4.UPDATE FOOD 5.EXIT=====");
     option=sc.nextInt();
     }
}
}
