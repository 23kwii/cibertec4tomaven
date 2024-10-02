package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuario;

public class UsuarioImp implements IUsuario{

	@Override
	public void RegistrarUsuario(TblUsuario usuario) {
		// nos conectamos con la unidad de persistencia
				//para poder enviar datos
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyeRefuerzo");
				EntityManager em=emf.createEntityManager();
				try{
				//iniciamos transaccion
				em.getTransaction().begin();
				//invocamos el metodo persist
				//para guardar datos en la bd
				em.persist(usuario);
				//confirmamos transaccion
				em.getTransaction().commit();
			}catch(RuntimeException e) {
			e.getMessage();
			}finally{	
				//cerramos
				em.close();
			}//fin del finally

		}//fin de metodo registrar usuario

	@Override
	public void ActualizarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUsuario> ListadoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblUsuario BuscarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
