package no.hvl.dat109;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BilRepo extends JpaRepository<Bil,String> {
         
      Bil findBilByRegNr(String regNr);

      List<Bil>findAll() ;
        
}
