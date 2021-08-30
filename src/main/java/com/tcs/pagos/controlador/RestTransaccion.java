package com.tcs.pagos.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.tcs.pagos.entidades.Transaccion;
import com.tcs.pagos.entidades.Producto;
import com.tcs.pagos.repositorio.TransaccionRepositorio;
import com.tcs.pagos.servicios.ITransaccionServicio;


@RestController
@RequestMapping("/api")
public class RestTransaccion {

	@Autowired
	private ITransaccionServicio transaccionServicio;
	
	
	@RequestMapping(value ="/producto", method = RequestMethod.GET, produces = "application/json")
	public List<Producto> listar() throws Exception {
		return transaccionServicio.listarProducto();
	}
	
	
	@RequestMapping(value = "/producto/{id}", method = RequestMethod.GET, produces = "application/json")
	public Producto listarPorId(@PathVariable Long id) {
		return transaccionServicio.buscarIdProducto(id);

	}
	
	@RequestMapping(value = "/crear", method = RequestMethod.POST, produces = "application/json")
	public void crear(Producto producto) {
		transaccionServicio.crear(producto);
	}
	
	
	
	/*

	@PutMapping("/editar/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(@PathVariable Long id, Transaccion transaccion) {
		transaccionServicio.editar(id, transaccion);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		transaccionServicio.eliminar(id);
	}

	@GetMapping("/balanceoTransacciones")
	public String comprobarBalanceo() {
		return transaccionServicio.comprobarBalanceoS2();
	}
	*/

}
