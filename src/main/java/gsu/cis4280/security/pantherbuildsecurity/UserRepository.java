package gsu.cis4280.security.pantherbuildsecurity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import gsu.cis4280.security.pantherbuildsecurity.model.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

	User findByEmailIgnoreCase(String username);
	
	

}
