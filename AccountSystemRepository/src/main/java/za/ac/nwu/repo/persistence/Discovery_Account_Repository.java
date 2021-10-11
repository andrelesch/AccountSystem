package za.ac.nwu.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.domain.persistence.Discovery_Account;

@Repository
public interface Discovery_Account_Repository extends JpaRepository<Discovery_Account, Number> {

}
