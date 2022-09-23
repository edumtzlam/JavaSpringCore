package com.mdf.ioc;

public class Director implements IEmpleado {

	private ICreacionInforme informeNuevo;
	
	public Director(ICreacionInforme informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	public String GetTareas() {
		return "Dirigir la empresa.";
	}
	
	public String getInforme() {
		return this.informeNuevo.getInforme();
	}
}
