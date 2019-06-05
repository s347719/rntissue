package rongyan.rntissue.repo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.StoreTeacher;

import java.util.List;

@Repository
public interface StoreTeacherDao extends CrudRepository<StoreTeacher, Integer> {


    StoreTeacher findByFName(String name);


    List<StoreTeacher> findAll();

}
