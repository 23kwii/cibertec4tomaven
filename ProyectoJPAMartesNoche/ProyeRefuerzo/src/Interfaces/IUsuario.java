package Interfaces;

import java.util.List;
import model.TblUsuario;
public interface IUsuario {
	//declaramos metodos//
		void RegistrarUsuario(TblUsuario usuario);
		void ActualizarUsuario(TblUsuario usuario);
		void EliminarUsuario(TblUsuario usuario);
		List<TblUsuario> ListadoUsuario();
		TblUsuario BuscarUsuario(TblUsuario usuario);
}//fin de la interface
