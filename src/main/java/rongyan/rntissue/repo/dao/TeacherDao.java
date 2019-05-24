package rongyan.rntissue.repo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.Teacher;

/**
 * @author lixf
 * @date 2019/3/27
 */
@Repository
public interface TeacherDao extends CrudRepository<Teacher,Integer> {

    @Query(" SELECT t FROM Teacher t WHERE t.name  = ?1")
    Teacher findTeacher(String name);

}
