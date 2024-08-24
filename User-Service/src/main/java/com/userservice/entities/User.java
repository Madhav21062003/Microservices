package com.userservice.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;

@Entity
@Table(name = "micro_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name", length = 20)
    private String name;

    @Column(name = "user_email")
    private String email;

    @Column(name = "about")
    private String about;

    @Transient
    List<Rating> ratings = new ArrayList<>();

}

