package turf.turfApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import turf.turfApp.entity.Turf;

@Repository
public interface TurfRepo extends JpaRepository<Turf, Integer> {
}
