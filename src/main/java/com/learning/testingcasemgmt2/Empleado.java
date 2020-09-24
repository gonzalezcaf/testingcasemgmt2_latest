package com.learning.testingcasemgmt2;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Empleado implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Nombre")
	private java.lang.String nombre;
	
	@org.kie.api.definition.type.Description(value = "Llave principal para persistencia de datos en db externa")
	@org.kie.api.definition.type.Label(value = "id")
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EMPLEADO_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "EMPLEADO_ID_GENERATOR", sequenceName = "EMPLEADO_ID_SEQUENCE")
	private java.lang.Long id;

	public Empleado() {
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public Empleado(java.lang.String nombre) {
		this.nombre = nombre;
	}

}