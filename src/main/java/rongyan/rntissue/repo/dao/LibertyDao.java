package rongyan.rntissue.repo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.Liberty;

@Repository
public interface LibertyDao extends CrudRepository<Liberty, Integer> {


    Liberty findById(int id);


}
