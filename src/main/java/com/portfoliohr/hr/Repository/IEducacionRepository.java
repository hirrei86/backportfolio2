
package com.portfoliohr.hr.Repository;
import com.portfoliohr.hr.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Long> {
    
}
