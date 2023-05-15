package com.example.babel.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "volumen")
public class Volumen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_volumen")
    private Integer idVolumen;

    @Column(name = "titulo")
    private String titulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estante", referencedColumnName = "id_estante")
    private Estante estante;

    @Column(name = "id_sala")
    private Integer idSala;

    @Column(name = "id_librero")
    private Integer idLibrero;

    @Column(name = "posicion")
    private Integer posicion;

    public Integer getIdVolumen() {
        return idVolumen;
    }

    public void setIdVolumen(Integer idVolumen) {
        this.idVolumen = idVolumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Integer getIdLibrero() {
        return idLibrero;
    }

    public void setIdLibrero(Integer idLibrero) {
        this.idLibrero = idLibrero;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Volumen() {
    }

    public Volumen(Integer idVolumen, String titulo, Estante estante, Integer idSala, Integer idLibrero, Integer posicion) {
        this.idVolumen = idVolumen;
        this.titulo = titulo;
        this.estante = estante;
        this.idSala = idSala;
        this.idLibrero = idLibrero;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Volumen{" +
                "idVolumen=" + idVolumen +
                ", titulo='" + titulo + '\'' +
                ", estante=" + estante +
                ", idSala=" + idSala +
                ", idLibrero=" + idLibrero +
                ", posicion=" + posicion +
                '}';
    }
}