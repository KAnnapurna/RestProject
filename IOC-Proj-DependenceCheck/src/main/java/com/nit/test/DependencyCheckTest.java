package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.beans.VehicleTarget;

public class DependencyCheckTest {

	public static void main(String[] args) {
//		BeanFactory factory=null;
	VehicleTarget target=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		//get Bean
		
		//factory=new XmlBeanFactory(new ClassPathResource("com/nit/cfgs/applicationContext.xml"));
		
		//get the target class bean
		target=factory.getBean("vehicle",VehicleTarget.class);
		System.out.println(target);
	}

}
