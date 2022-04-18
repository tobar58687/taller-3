package dto;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import src.main.java.dto.orden;

public interface repositoriointerface extends MongoRepository<orden,String> {
	//public Optional<orden> findById(String id);
	

}
