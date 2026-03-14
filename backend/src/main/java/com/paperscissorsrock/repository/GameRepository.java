import org.springframework.data.repository.CrudRepository;
import com.paperscissorsrock.entity.Game;

public interface GameRepository extends CrudRepository<Game, Long> {}