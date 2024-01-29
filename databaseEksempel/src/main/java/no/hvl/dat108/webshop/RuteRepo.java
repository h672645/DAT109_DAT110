package no.hvl.dat108.webshop;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuteRepo extends JpaRepository<Rute, String> {
	Rute findByRutenummer(Integer nummer);	
	
	List<Rute> findAll();
}