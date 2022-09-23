package com.mdf.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empleados {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext objCtx = new ClassPathXmlApplicationContext("application.context.xml");
		IEmpleado objDirector = objCtx.getBean("Director", IEmpleado.class);
		IEmpleado objSecretario = objCtx.getBean("Secretario", IEmpleado.class);
		IEmpleado objJefe = objCtx.getBean("Jefe", IEmpleado.class);
		System.out.println("Director: " + objDirector.getInforme());
		System.out.println("Secretario: " + objSecretario.getInforme());
		System.out.println("Jefe: " + objJefe.getInforme());
		objCtx.close();
	}

}
