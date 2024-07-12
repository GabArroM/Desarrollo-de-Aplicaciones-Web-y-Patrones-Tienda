package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //atomaticamente los setters and getter
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private String rutaImagen;
    private int existencias;
    private boolean activo;
    private Long idCategoria;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, String rutaImagen, int existencias, boolean activo, Long idCategoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.existencias = existencias;
        this.activo = activo;
        this.idCategoria = idCategoria;
    }
    
}
