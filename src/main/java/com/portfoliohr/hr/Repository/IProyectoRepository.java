
package com.portfoliohr.hr.Repository;

import com.portfoliohr.hr.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Long> {
    
}
