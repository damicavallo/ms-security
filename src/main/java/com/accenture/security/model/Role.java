package com.accenture.security.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="role_id")
    private Long id;

    @Column(name="role")
    private String role;


    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    private Set<User> users;

    public Role() { }

    public Long getId() {
            return id;
        }

    public void setId(Long id) {
            this.id = id;
        }

    @JsonIgnore
    public String getRole() {
            return role;
        }

    public void setRole(String role) {
            this.role = role;
        }

    public Set<User> getUsers() {
            return users;
        }

    public void setUsers(Set<User> users) {
            this.users = users;
        }
}
