package sn.mod.senegal.gatewayservice.config;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
@Component

// si la req n est pas valide
//la req pass iici dab avant la class filter
//
/*
Cette classe étendra la AuthenticationEntryPoint classe de Spring  et remplacera sa méthode.
 Il rejette chaque demande non authentifiée et envoie le code d'erreur 401
 */
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    private static final long serialVersionUID = -7858869558953243875L;
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
