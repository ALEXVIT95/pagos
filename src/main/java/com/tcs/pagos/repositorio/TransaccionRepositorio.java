package com.tcs.pagos.repositorio;


import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.tcs.pagos.entidades.Producto;
/*

import com.tcs.pagos.entidades.Transaccion;

@Repository
public interface TransaccionRepositorio extends org.springframework.data.repository.CrudRepository<Transaccion, Long>{

}
*/
@Repository
public interface TransaccionRepositorio extends CrudRepository<Producto, Long>{
	
	
}
