package br.com.erudio.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.erudio.response.Cambio;


@FeignClient(name = "cambio-service")
public interface CambioProxy {
	
	@GetMapping(value = "/cambio-service/{amout}/{from}/{to}")
	public Cambio getCambio(@PathVariable(value = "amout")Double amout, @PathVariable(value = "from") String from,
            @PathVariable(value = "to") String to );

}
