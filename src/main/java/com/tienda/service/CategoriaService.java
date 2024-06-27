package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //firma de un metodo
    //Metodo que obtien una lista de categorias

    //Se obtiene un listado de categoria en un list
    public List<Categoria> getCategorias(boolean activo);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
