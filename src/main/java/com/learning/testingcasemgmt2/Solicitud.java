package com.learning.testingcasemgmt2;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Solicitud extends org.drools.persistence.jpa.marshaller.VariableEntity implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Description("Numero de solicitud de prestamo")
	@org.kie.api.definition.type.Label("Id Solicitud")
	private java.lang.Integer idSolicitud;
	@org.kie.api.definition.type.Description("Monto de dinero solicitado")
	@org.kie.api.definition.type.Label("Monto Solicitado")
	private java.lang.Integer monto;
	@org.kie.api.definition.type.Description("Monto Final Aprobado")
	@org.kie.api.definition.type.Label("Monto Aprobado")
	private java.lang.Integer montoaprobado;
	@org.kie.api.definition.type.Description("Llave principal para persistencia de datos en db externa")
	@org.kie.api.definition.type.Label("id")
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "SOLICITUD_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "SOLICITUD_ID_GENERATOR", sequenceName = "SOLICITUD_ID_SEQUENCE")
	private java.lang.Long id;

	public Solicitud() {
	}

	public java.lang.Integer getIdSolicitud() {
		return this.idSolicitud;
	}

	public void setIdSolicitud(java.lang.Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public java.lang.Integer getMonto() {
		return this.monto;
	}

	public void setMonto(java.lang.Integer monto) {
		this.monto = monto;
	}

	public java.lang.Integer getMontoaprobado() {
		return this.montoaprobado;
	}

	public void setMontoaprobado(java.lang.Integer montoaprobado) {
		this.montoaprobado = montoaprobado;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Solicitud(java.lang.Integer idSolicitud, java.lang.Integer monto,
			java.lang.Integer montoaprobado, java.lang.Long id) {
		this.idSolicitud = idSolicitud;
		this.monto = monto;
		this.montoaprobado = montoaprobado;
		this.id = id;
	}

}