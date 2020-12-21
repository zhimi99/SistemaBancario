package app.proyecto.SistemaBancario.DAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import app.proyecto.SistemaBancario.Entidades.Cliente;
import app.proyecto.SistemaBancario.Entidades.Cuenta;

@Stateless
public class CuentaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void crearCuenta(Cuenta cuenta) {
		this.em.persist(cuenta);
		
	}
	
	/*public Cuenta buscarCuenta(String nombres) {
		String jpql = "SELECT a FROM Autor a JOIN FETCH a where a.nombres = :nombres";
		Query query = em.createQuery(jpql, Autor.class);
		query.setParameter("nombres", nombres);
		Autor autor = (Autor) query.getSingleResult();
		return autor;
	}*/
	
	public void actualizarCuenta(Cuenta cuenta ) {
		em.merge(cuenta);
	}
	
	public List<Cuenta> mostrarCuentas() {
		String jpql = "SELECT a FROM Cuenta a";
		Query query = em.createQuery(jpql, Cuenta.class);
		List<Cuenta> cuentas = query.getResultList();
		
		return cuentas;
	}
	
	public Cuenta buscarCuentaID(int id) {
		Cuenta cli= new Cuenta();
		try {
			String jpql = "SELECT l FROM Cuenta l where l.id = :id";
			Query query = em.createQuery(jpql, Cuenta.class);
			query.setParameter("id", id);
			cli = (Cuenta) query.getSingleResult();
		} catch (Exception e) {
			cli=null;
		}
		
		return cli;
	}

}