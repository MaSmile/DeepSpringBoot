package com.example.demo.Chapter4.proxy;

import static org.hamcrest.CoreMatchers.nullValue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.bytebuddy.asm.Advice.This;

public class ProxyBean implements InvocationHandler{
	private Object target = null;
	
	private Interceptor interceptor = null;
	
	public static Object getProxyBean(Object target, Interceptor interceptor) {
		ProxyBean proxyBean = new ProxyBean();
		// 保存被代理对象
		proxyBean.target = target;
		// 保存拦截器
		proxyBean.interceptor = interceptor;
		// 生成代理对象
		Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxyBean);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		boolean exceptionFlag = false;
		Invocation invocation = new Invocation(target, method, args);
		Object object = null;
		try {
			if (this.interceptor.before()) {
				object = this.interceptor.around(invocation);
			} else {
				object = method.invoke(target, args);
			}
		} catch (Exception e) {
			// TODO: handle exception
			exceptionFlag = true;
		}
		this.interceptor.after();
		if (exceptionFlag) {
			this.interceptor.afterThrowing();
		} else {
			this.interceptor.afterReturning();
			return object;
		}
		return null;
	}
	
}
