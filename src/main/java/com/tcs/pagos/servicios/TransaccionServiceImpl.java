package com.tcs.pagos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/*
import com.tcs.pagos.entidades.Transaccion;
*/
import com.tcs.pagos.entidades.Producto;
import com.tcs.pagos.repositorio.TransaccionRepositorio;

@Service
public class TransaccionServiceImpl implements ITransaccionServicio {

	@Autowired
	private TransaccionRepositorio transaccionRepositorio;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> listarProducto() {
		return (List<Producto>) transaccionRepositorio.findAll();
	}
	

	@Override
	@Transactional(readOnly = true)
	public Producto buscarIdProducto(Long id) {
		return transaccionRepositorio.findById(id).orElse(null);
	}

	
	@Override
	public void crear(Producto producto) {
		transaccionRepositorio.save(producto);

	}
	
	
	
	/*
	@Override
	public void EliminarProducto(Long id) {
		// TODO Auto-generated method stub

	}
	@Override
	public void editar(Long id, Producto producto) {
		producto.setIdFactura(id);
		transaccionRepositorio.save(producto);

	}

	@Override
	public void eliminar(Long id) {
		transaccionRepositorio.deleteById(id);

	}
	//@Override
	//public String comprobarBalanceoS2() {
		//return "Serv1: " + customerServicio.comprobarBalanceoS1() + ", Serv2: " + bl;
	//}

	@Override
	public String comprobarBalanceoS2() {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	

}
