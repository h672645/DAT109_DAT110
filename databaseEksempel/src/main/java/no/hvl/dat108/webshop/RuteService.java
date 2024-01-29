package no.hvl.dat108.webshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuteService {

    @Autowired  private static RuteRepo ruterepo;
     
    public List<Rute> rutelist() {
        return ruterepo.findAll();
    }
    public Rute finnRutbyNummer(Integer nummer){
        return ruterepo.findByRutenummer(nummer);
    }
}
