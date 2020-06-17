package net.blow.jwtappdemo.security.jwt;

import net.blow.jwtappdemo.model.Role;
import net.blow.jwtappdemo.model.Status;
import net.blow.jwtappdemo.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {
    public JwtUserFactory() {
    }
    public static JwtUser creat(User user){
        return new JwtUser(
                        user.getId(),
                        user.getUsername(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getEmail(),
                        user.getPassword(),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated(),
                mapToGrantedAuthorities(new ArrayList<>(user.getRoles()))
                );
    }
        private static List<GrantedAuthority> mapToGrantedAuthorities (List<Role> userRoles) {
            return userRoles.stream()
                    .map(role ->
                            new SimpleGrantedAuthority(role.getName())
                    ).collect(Collectors.toList());
        }
    }
