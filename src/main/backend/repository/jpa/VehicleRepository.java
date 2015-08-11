package repository.jpa;

import bean.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shian_mac on 8/10/15.
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
