package com.satya.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremAPI {

	public static void main(String[] args) {
		Bean ben=new Bean ("ABD","20");
		Bean ben1=new Bean ("ABD","20");
		Bean ben2=new Bean ("ABD","20");
		List<String> list =new ArrayList<String>();
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(pasas -> pasas.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  
		
		
		
	}
	
	
}



class Bean{
	
	private String name ; 
	private String roll ;
	
	public Bean(String name , String roll){
		this.name=name;
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
	
	
}


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  