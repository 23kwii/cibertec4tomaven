package TestEntidad;

import DaoImp.ClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		// instanciamos las respectivas clases
		TblCliente tblcli=new TblCliente();
		ClienteImp cliimp=new ClienteImp();
		//asignamos valores que seran
		// registrados en BD
		/*tblcli.setNombre("Fabiola");
		tblcli.setApellido("Dalton Foster");
		tblcli.setSexo("F");
		tblcli.setDni("70362587");
		tblcli.setEmail("fabiolaD@gmail.com");
		tblcli.setTelef("999999123");
		//invocamos al metodo registar
		cliimp.RegistrarCliente(tblcli);
		//emitimos mensaje por consola
		System.out.println("datos registrados en BD");
		*/
		
		tblcli.setIdcliente(1);
		tblcli.setNombre("Rosa Maria");
		tblcli.setApellido("perez perez");
		tblcli.setSexo("F");
		tblcli.setDni("10456378");
		tblcli.setEmail("rosap@gmail.com");
		tblcli.setTelef("991234567");
		//invocamos el metodo actualizar
		cliimp.ActualizarCliente(tblcli);
		//emitimos mensaje por consola
		System.out.println("dato actualizado");
	}

}// fin de la clase
