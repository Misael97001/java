package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private Date ultimaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	public Directorio() {
		contactos = new ArrayList<Contacto>();

	}
	
	public void depurar() {
		correctos= new ArrayList<Contacto>();
		incorrectos= new ArrayList<Contacto>();
		for(int i=0; i<contactos.size();i++) {
			if(contactos.get(i).getDireccion()!=null) {
				correctos.add(contactos.get(i));
			}else {
				incorrectos.add(contactos.get(i));
			}

		}
	}

	public void vaciarLista() {
		contactos.clear();
	}
	public boolean agregarContacto(Contacto contacto) {
		Contacto contactoEncontrado = buscarPorCedula(contacto.getCedula());
		if (contactoEncontrado != null) {
			return false;

		} else {
			contactos.add(contacto);
			this.ultimaModificacion = new Date();
			return true;

		}

	}

	public String consultarUltimaModificacion() {
		if (this.ultimaModificacion == null) {
			return "sin modificar";
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			return sdf.format(ultimaModificacion);
		}
	}

	public Contacto buscarPorCedula(String cedulaContacto) {
		for (int i = 0; i < contactos.size(); i++) {
			if (cedulaContacto.equals(contactos.get(i).getCedula())) {
				return contactos.get(i);
			}
		}
		return null;
	}

	public int contarPerdidos() {
		int perdidos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getDireccion() == null) {
				perdidos = perdidos + 1;
			}
		}
		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i) != null) {
				for (int j = 0; j < contactos.get(i).getTelefonos().size(); j++) {
					if (contactos.get(i).getTelefonos().get(j).getEstado().equals("C")
							&& contactos.get(i).getTelefonos().get(j).getTipo().equals("Convencional")) {
						fijos = fijos + 1;

					}
				}
			}

		}
		return fijos;
	}

	
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	
}
