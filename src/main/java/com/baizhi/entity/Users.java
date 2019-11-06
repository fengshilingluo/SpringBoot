package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String ip;
    private String source;
    private String role;
    private String status;
}
