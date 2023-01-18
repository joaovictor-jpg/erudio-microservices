package br.com.erudio.controller;

import br.com.erudio.model.Cambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("cambio-service")
public class CambioController {

    @Autowired
    private Environment environment;

    @GetMapping(value = "/{amout}/{from}/{to}")
    public Cambio getCambio(@PathVariable(value = "amout")BigDecimal amout, @PathVariable(value = "from") String from,
                            @PathVariable(value = "to") String to ) {
        var port = environment.getProperty("local.server.port");

        return new Cambio(1L, from, to, BigDecimal.ONE, BigDecimal.ONE, port);
    }
}
