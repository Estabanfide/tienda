package com.tienda.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "id_categoria")
    private Long id_categoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_producto")
    List<Producto> productos;
    
    public Producto() {
    }

    public Producto(Long idProducto, Long id_categoria, String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo, List<Producto> productos) {
        this.idProducto = idProducto;
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        this.productos = productos;
    }



}
