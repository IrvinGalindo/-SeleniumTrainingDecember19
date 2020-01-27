package pojos;

import java.util.HashMap;

public class Project {
	String nombreproyecto;
	String descripcion;
	String photoURL;
	HashMap<String, String> hmap;
	String startdate;
	String enddate;

	public Project(String nombreproyecto, String descripcion, String photoURL, HashMap<String, String> hmap,
			String startdate, String enddate) {
		this.nombreproyecto = nombreproyecto;
		this.descripcion = descripcion;
		this.photoURL = photoURL;
		this.hmap = hmap;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public String getNombreproyecto() {
		return nombreproyecto;
	}

	public void setNombreproyecto(String nombreproyecto) {
		this.nombreproyecto = nombreproyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public HashMap<String, String> getMembers() {
		return hmap;
	}

	public void setMembers(HashMap<String, String> hmap) {
		this.hmap = hmap;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

}