package com.mdf.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empleados {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext objCtx = new ClassPathXmlApplicationContext("application.context.xml");
		IEmpleado objDirector = objCtx.getBean("Director", IEmpleado.class);
		IEmpleado objSecretario = objCtx.getBean("Secretario", IEmpleado.class);
		System.out.println("Director: " + objDirector.getInforme());
		System.out.println("Secretario: " + objSecretario.getInforme());
		objCtx.close();
	}

}
