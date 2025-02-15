package com.me.Practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.annotation.Generated;


@Entity
@Table(name = "rb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Generated
    private Long id;

    private String username;

    private String password;

    private String role;

}