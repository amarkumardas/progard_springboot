package com.example.HotelSpringbootProject.models;

import lombok.Data;

import javax.persistence.*;

@Data//to avoid boiler plate
@Entity//to make this class act as table of db
//@Table(name="customerRole")//giving name to table
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
}
