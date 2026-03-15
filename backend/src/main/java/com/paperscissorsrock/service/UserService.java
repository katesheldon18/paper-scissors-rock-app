import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.paperscissorsrock.repository.UserRepository;
import com.paperscissorsrock.entity.User;

@Service
public class UserService {

    // https://docs.spring.io/spring-framework/reference/core/beans/dependencies/factory-autowire.html

    @Autowired
    private UserRepository userRepository;


    // https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }
}