package repository;

import com.oliveiradev.SegurosApp.model.Apolice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApoliceRepository extends JpaRepository<Apolice, Long> {
}
