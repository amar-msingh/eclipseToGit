package Arrays;

import java.util.Scanner;

public class productManage {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Product arr[];
		System.out.println("Enter the number of product");
		int numberOfProduct;
		numberOfProduct=obj.nextInt();
		arr=new Product[numberOfProduct];
		int proID,price;String name;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Product ID :");
			proID=obj.nextInt();
			System.out.println("Enter Product Name :");
			name=obj.next();
			System.out.println("Enter Product Price");
			price=obj.nextInt();
			arr[i]=new Product(proID,name,price);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
