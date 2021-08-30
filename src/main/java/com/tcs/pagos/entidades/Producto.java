package com.tcs.pagos.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "factura")
public class Producto {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFactura;
    
    
    private float total;
    private String fecha;
    private String metodo_pago;
    private int Cuenta_idCuenta;
    private int Supermercado_idSupermercado;
    private int Cliente_idCliente;
	
    
	public Long getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMetodo_pago() {
		return metodo_pago;
	}
	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}
	public int getCuenta_idCuenta() {
		return Cuenta_idCuenta;
	}
	public void setCuenta_idCuenta(int cuenta_idCuenta) {
		Cuenta_idCuenta = cuenta_idCuenta;
	}
	public int getSupermercado_idSupermercado() {
		return Supermercado_idSupermercado;
	}
	public void setSupermercado_idSupermercado(int supermercado_idSupermercado) {
		Supermercado_idSupermercado = supermercado_idSupermercado;
	}
	public int getCliente_idCliente() {
		return Cliente_idCliente;
	}
	public void setCliente_idCliente(int cliente_idCliente) {
		Cliente_idCliente = cliente_idCliente;
	}
	
    
	
}
