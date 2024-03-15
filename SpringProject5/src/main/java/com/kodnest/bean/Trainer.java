package com.kodnest.bean;

public class Trainer {
int id;
String name;
public int getId() {
	System.out.println("getter-id");
	return id;
}
public void setId(int id) {
	this.id = id;
	System.out.println("setter-id");
}
public String getName() {
	System.out.println("getter-name");
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("setter-name");
}
public Trainer() {
	super();
System.out.println("0-param-constr");
}
public Trainer(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	System.out.println("param-constr");
}
@Override
public String toString() {
	return "Trainer [id=" + id + ", name=" + name + "]";
}

}
