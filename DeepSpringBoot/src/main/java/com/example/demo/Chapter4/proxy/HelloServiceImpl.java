package com.example.demo.Chapter4.proxy;

public class HelloServiceImpl implements HelloService{

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		if (null == name || name.trim() == "") {
			throw new RuntimeException("paramter is null!!");
		}
		System.out.println("hello " + name);
	}
	
}