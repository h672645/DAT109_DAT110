package no.hvl.dat109;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class BilService{

@Autowired  private BilRepo bilrepo;

 public  Bil finnBil(String regNr){
    return bilrepo.findBilByRegNr(regNr);
}


  public  List<Bil> bilListe(){
    return bilrepo.findAll();
}
}