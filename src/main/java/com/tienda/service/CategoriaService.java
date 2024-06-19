package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
        //firma de un metodo
       //Metodo que obtien una lista de categorias
    public List<Categoria> getCategorias(boolean activo);
}
