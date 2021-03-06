package gsu.cis4280.security.pantherbuildsecurity.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import gsu.cis4280.security.pantherbuildsecurity.model.User;


@Repository
public interface UserRepository extends CrudRepository <User, Long> {

	User findByEmailIgnoreCase(String username);
	
	

}
