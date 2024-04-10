package com.xufq.springboottest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

import java.time.LocalDate;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id", columnDefinition = "int(11)")
    private Integer id;

    @Column(columnDefinition = "varchar(64)", name="name")
    private String name;

    @Column(name = "birthday", columnDefinition = "date")
    private LocalDate birthday;
}
