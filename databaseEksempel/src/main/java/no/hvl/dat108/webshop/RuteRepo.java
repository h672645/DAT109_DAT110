package no.hvl.dat108.webshop;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuteRepo extends JpaRepository<Rute, Integer> {
	Rute findByRutenummer(Integer nummer);	
	List<Rute> findAll();
}