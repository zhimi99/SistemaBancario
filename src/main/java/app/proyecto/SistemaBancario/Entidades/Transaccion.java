package app.proyecto.SistemaBancario.Entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transaccion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	private String tipo;
	private Double monto;
	private int cuentaDestino;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public int getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(int cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", fechaRegistro=" + fechaRegistro + ", tipo=" + tipo + ", monto=" + monto
				+ ", cuentaDestino=" + cuentaDestino + "]";
	}
	
	
}
