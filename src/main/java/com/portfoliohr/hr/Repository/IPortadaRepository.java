
package com.portfoliohr.hr.Repository;

import com.portfoliohr.hr.Entity.Portada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPortadaRepository extends JpaRepository<Portada,Long> {
    
}