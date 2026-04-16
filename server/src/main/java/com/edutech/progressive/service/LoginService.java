package com.edutech.progressive.service;

import com.edutech.progressive.entity.Supplier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class LoginService implements UserDetailsService {

    public List<Supplier> getAllUsers() throws SQLException {
        return null;
    }

    public Optional<Supplier> getUserById(Integer userId)  throws SQLException {
        return null;
    }

    public Supplier getSupplierByName(String username) throws SQLException {
        return null;
    }

    public Supplier createUser(Supplier user)  throws SQLException {
        return null;
    }

    public Supplier updateUser(Supplier user)  throws SQLException {
        return null;
    }

    public void deleteUser(Integer id)  throws SQLException{
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }
}