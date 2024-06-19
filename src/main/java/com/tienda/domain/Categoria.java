package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

@Data //atomaticamente los setters and getter
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;//hibernante lo transforma en ruta_imagen
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
