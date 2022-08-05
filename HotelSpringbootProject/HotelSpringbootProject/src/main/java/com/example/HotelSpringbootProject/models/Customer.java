package com.example.HotelSpringbootProject.models;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data//to avoid boiler plate
@Entity//to make this class act as table of db
//@Table(name="customers")//giving name to table
public class Customer implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
     private String name;
    @Column(nullable = false)
     private String city;
    @Column(nullable = false)
     private int numberOfPerson;
    @Column(nullable = false)
    private char gender;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    //cascade=CascadeType.ALL means Cascading is the way to achieve this. When we perform some action on the target entity, the same action will be applied to the associated entity.
    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)//data will be loaded on the spot
    @JoinTable(name="customerRole",joinColumns = @JoinColumn(name="Customer",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="Role",referencedColumnName = "id"))
    private Set<Role> roles=new HashSet<>();


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities=this.roles.stream().map((role -> new SimpleGrantedAuthority(role.getName()))).collect(Collectors.toList());
        return authorities;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
