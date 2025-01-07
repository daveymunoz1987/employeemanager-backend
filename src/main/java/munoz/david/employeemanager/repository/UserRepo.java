package munoz.david.employeemanager.repository;

import munoz.david.employeemanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUserNameAndPassword(String userName, String password);
}
