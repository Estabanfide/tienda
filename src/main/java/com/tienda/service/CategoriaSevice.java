package com.tienda.service.impl;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    public List<Categoria> getCategorias(boolean avtivos);
}
