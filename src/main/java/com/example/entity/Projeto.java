
package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
