package com.tt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobileDriver {
	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("Mobile.xml");
		Mobile mobile=new Mobile();
		mobile.usedFor();
		
	}

}
