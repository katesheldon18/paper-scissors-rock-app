// https://docs.spring.io/spring-data/jpa/reference/repositories/definition.html
 
import org.springframework.data.repository.CrudRepository;
import com.paperscissorsrock.entity.User;

// comes with built-in methods (CRUD)
public interface UserRepository extends CrudRepository<User, Long> {}