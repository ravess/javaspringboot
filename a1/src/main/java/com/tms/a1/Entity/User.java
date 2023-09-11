package com.tms.a1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userid")
    private long userId;
    @Column(name = "username")
    private String username;
    @Column(name = "userpassword")
    private String userPassword;
    @Column(name = "useremail")
    private String userEmail;
    @Column(name = "usergroups")
    private String userGroups;
    @Column(name = "userisactive")
    private Boolean userIsActive;
}
