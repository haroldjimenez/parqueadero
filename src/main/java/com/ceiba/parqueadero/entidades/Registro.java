package com.ceiba.parqueadero.entidades;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "SECUENCIA_NUMERO_REGISTRO", sequenceName = "numero_registro_seq", allocationSize = 1)
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SECUENCIA_NUMERO_REGISTRO")
	private Long numeroRegistro;
	
	@ManyToOne
	@JoinColumn(name = "vehiculo", nullable = false)
	private Vehiculo vehiculo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_ingreso", nullable = false)
	private Date fechaIngreso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_salida")
	private Date fechaSalida;

	@Column(name = "total_pagado")
	private BigDecimal totalPagado;

	public Long getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(Long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public BigDecimal getTotalPagado() {
		return totalPagado;
	}

	public void setTotalPagado(BigDecimal totalPagado) {
		this.totalPagado = totalPagado;
	}

}
