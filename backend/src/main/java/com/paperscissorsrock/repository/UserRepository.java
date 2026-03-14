import org.springframework.data.repository.CrudRepository;
import com.paperscissorsrock.entity.User;

// comes with built-in methods (CRUD)
public interface UserRepository extends CrudRepository<User, Long> {}