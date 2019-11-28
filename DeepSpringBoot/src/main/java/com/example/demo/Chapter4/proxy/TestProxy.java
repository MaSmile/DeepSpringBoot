package com.example.demo.Chapter4.proxy;

public class TestProxy {
	public static void main(String[] args) {
		HelloService helloService = new HelloServiceImpl();
		HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
		proxy.sayHello("maxiao");
	}
}
