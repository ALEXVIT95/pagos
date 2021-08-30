package com.tcs.pagos.servicios;

import java.util.List;

/*

import com.tcs.pagos.entidades.Transaccion;

public interface ITransaccionServicio {
	public List< Transaccion> listarTransacciones();
	public Transaccion buscarIdTransacion(Long id);
	public void EliminarTransaccion(Long id);
	public void crear(Transaccion Orders);
	public void editar(Long id, Transaccion Orders);
	public void eliminar(Long id);
	public String comprobarBalanceoS2();
	
	
}
*/
import com.tcs.pagos.entidades.Producto;

public interface ITransaccionServicio {
	public List< Producto> listarProducto();
	public Producto buscarIdProducto(Long id);
	
	public void crear(Producto producto);
	
	
	
	/*
	 public void EliminarProducto(Long id); 
	 public void editar(Long id, Producto producto);
	public void eliminar(Long id);
	public String comprobarBalanceoS2();
	*/
	
	
}
