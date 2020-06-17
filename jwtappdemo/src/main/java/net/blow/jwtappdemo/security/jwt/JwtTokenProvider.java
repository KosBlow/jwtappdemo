package net.blow.jwtappdemo.security.jwt;

import net.blow.jwtappdemo.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JwtTokenProvider {

    private String secret;
    private long validityInMilliseconds;

    public String creatToken(String username, List<Role> role) {

    }
    public Authentication getAuthentication(String token) {

    }
    public String getUsername(String token) {

    }
    public boolean validateToken(String token) {

    }
    private List<String> getRoleName(List<Role> userRoles) {
        List<String> result = new ArrayList<>();

        userRoles.forEach(role -> {
            result.add(role.getName());
        });
        return result;
    }
}
