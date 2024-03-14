package com.driver;

public class Supplier {
	private int id;
    private String name;
    private String address;

    public Supplier() {}

    public Supplier(String name, String address) {
    	// your code goes here
        this.name = name;
        this.address = address;
    }

    public int getId() {
    	// your code goes here
        return id;
    }

    public void setId(int id) {
    	// your code goes here
        this.id=id;
    }

    public String getName() {
    	// your code goes here
        return name;
    }

    public void setName(String name) {
    	// your code goes here
        this.name=name;
    }

    public String getAddress() {
    	// your code goes here
        return address;
    }

    public void setAddress(String address) {
    	// your code goes here
        this.address=address;
    }
}
