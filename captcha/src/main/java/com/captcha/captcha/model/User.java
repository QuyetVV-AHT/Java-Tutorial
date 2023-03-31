package com.captcha.captcha.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;

    @Transient
    private String captcha;

    @Transient
    private String hiddenCaptcha;

    @Transient
    private String realCaptcha;
}
