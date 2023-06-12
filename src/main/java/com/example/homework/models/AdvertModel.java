package com.example.homework.models;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "advertShop")
@Data
public class AdvertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private int weight;

    @Column
    private String disc;

    @Column
    private String size;



}
