package controller;

import Services.ServicesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class ControllerProvider {

    @Autowired
    private ServicesProvider acceso;

    @GetMapping("/Provider")
    public Class<? extends ServicesProvider> DatosProvider(){
        return acceso.getClass();
    }
}