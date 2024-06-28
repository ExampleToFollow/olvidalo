package com.example.gtics_lab10_20213704.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "img", schema = "stfgame")
public class Img {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idimage", nullable = false)
    private Integer id;

    @Column(name = "imagen", nullable = false)
    private byte[] imagen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

}