/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

/**
 *
 * @author Johan
 */
public class RedSocialDTO {
    private Integer codigo;
    private String nombre;
    private String correo;
    private String contrasena;

    public RedSocialDTO() {
    }

    public RedSocialDTO(Integer codigo, String nombre, String correo, String contrasena) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "RedSocialDTO{" + "codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    }
    
    
}
