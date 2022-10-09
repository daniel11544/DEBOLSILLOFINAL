//package com.proyecto.debolsilloColombia.entidades;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "MovimientoDinero")
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//public class MovimientoDinero{
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    private String concept;
//
//    private float amount ;
//
//    @ManyToOne
//    @JoinColumn(name = "empleado_id")
//    private Empleado empleado;
//
//    @ManyToOne
//    @JoinColumn(name = "empresa_id")
//    private Empresa empresa;
//
//    private double createdAt;
//
//    private double updatesAt;
//
//
//
//}