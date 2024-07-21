package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    //firma de un metodo
    //Metodo que obtien una lista de Producto s

    //Se obtiene un listado de Producto  en un list
    public List<Producto> getProductos(boolean activo);

    // Se obtiene un Producto , a partir del id de un Producto 
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo Producto  si el id del Producto  esta vacío
    // Se actualiza un Producto  si el id del Producto  NO esta vacío
    public void save(Producto producto);

    // Se elimina el Producto  que tiene el id pasado por parámetro
    public void delete(Producto producto);

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
    //buscar por descripcion
    public List<Producto> findByDescription(String texto);
    
}
