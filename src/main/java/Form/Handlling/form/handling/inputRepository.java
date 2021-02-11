package Form.Handlling.form.handling;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inputRepository extends JpaRepository<Input,Integer> {
}
