package com.grv.spring.security.model;

public class UserInfo {
	
	private int usuario_id;
    private String email; 
    private String password;
    private String dni;
    private int id_rol;
    private int id_estado;
    private int id_usuario_detalles;
    

    public UserInfo()  {
         
    }
 
    public UserInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public int getId_usuario_detalles() {
		return id_usuario_detalles;
	}

	public void setId_usuario_detalles(int id_usuario_detalles) {
		this.id_usuario_detalles = id_usuario_detalles;
	}
 

}