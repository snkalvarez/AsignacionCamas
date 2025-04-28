package husjp.api.asignacionCamasMicroservicio.repository;

import husjp.api.asignacionCamasMicroservicio.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

    List<Servicio> findByBloqueServicio_Id(Integer idBloqueServicio);
}
