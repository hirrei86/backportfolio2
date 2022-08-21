
package com.portfoliohr.hr.Interface;

import com.portfoliohr.hr.Entity.Skill;
import java.util.List;


public interface ISkillService {
    //traer una lista de skill
    public List<Skill> getSkill();
   
    //guardar un objeto de tipo Skill
    public void saveSkill(Skill skill);
    
    //eliminar un objeto buscado por ID
    public void deleteSkill(Long id);
    
    //buscar una Skill por id
    public Skill findSkill(Long id);
    }