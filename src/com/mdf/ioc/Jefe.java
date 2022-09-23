package com.mdf.ioc;

public class Jefe implements IEmpleado {

	private ICreacionInforme informeNuevo;

	public void setInformeNuevo(ICreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String GetTareas() {
		return "Gestionar la agenda de los jefes.";
	}

	public String getInforme() {
		return this.informeNuevo.getInforme();
	}

}
