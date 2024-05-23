package com.nts.list;

class Pen{
	String color;
	String type;//ballpoint,gel
	
	public void write() {
		System.out.println("writing something");
	}

	
	@Override
	public String toString() {
		return "Pen [color=" + color + ", type=" + type + "]";
	}
	
	
}


public class ClassAndObject {
	
	public static void main(String[] args) {
		
		Pen p=new Pen();
		p.color="blue";
		p.type="gel";
		
	System.out.println(p.toString());
		
		
	}

}
