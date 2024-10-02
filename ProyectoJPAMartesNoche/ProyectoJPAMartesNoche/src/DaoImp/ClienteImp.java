package DaoImp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.*;
import model.TblCliente;
public class ClienteImp implements ICliente {

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		// nos conectamos con la unidad de persistencia
		//para poder enviar datos
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em=emf.createEntityManager();
		try{
		//iniciamos transaccion
		em.getTransaction().begin();
		//invocamos el metodo persist
		//para guardar datos en la bd
		em.persist(cliente);
		//confirmamos transaccion
		em.getTransaction().commit();
	}catch(RuntimeException e) {
	e.getMessage();
	}finally{	
		//cerramos
		em.close();
	}//fin del finally
	}//fin de metodo registrar cliente

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// nos conectamos con la unidad de persistencia
		// para actualizar los daros en la bd
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em=emf.createEntityManager();
		try{
		//iniciamos transaccion
		em.getTransaction().begin();
		// invocamos el metodo que actualiza
		em.merge(cliente);
		//confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException e){
			//enviamos mensaje si hay error
			e.getMessage();
		}finally{
		//cerramos
		em.close();
		
		}//fin del finally
	}//fin de metodo actualizar cliente

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}//fin de metodo eliminar cliente

	@Override
	public List<TblCliente> ListadoCliente() {
		// TODO Auto-generated method stub
		return null;
	}//fin de metodo listar cliente

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}//fin de metodo buscar cliente

}//fin de la clase clienteimp//
