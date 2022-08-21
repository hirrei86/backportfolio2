
package com.portfoliohr.hr.Repository;

import com.portfoliohr.hr.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill,Long> {
    
}
