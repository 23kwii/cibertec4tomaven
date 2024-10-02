package TestEntidades;
import DaoImp.UsuarioImp;
import model.TblUsuario;

public class TestUsuario {

	public static void main(String[] args) {
		// instanciamos las respectivas clases
				TblUsuario tblusu=new TblUsuario();
				UsuarioImp usuimp=new UsuarioImp();
				//asignamos valores que seran
				// registrados en BD
				tblusu.setClaveusuario("12345678");
				tblusu.setNousuario("wildoom");
				
				//invocamos al metodo registar
				usuimp.RegistrarUsuario(tblusu);
				//emitimos mensaje por consola
				System.out.println("datos registrados en BD");

	}

}// fin de la clase
