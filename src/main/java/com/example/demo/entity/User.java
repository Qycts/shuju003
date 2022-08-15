package com.example.demo.entity;


import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "u")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 20)
    private String name;
    @Column(nullable = false,length = 16)
    private String password;
}
