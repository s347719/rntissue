package rongyan.rntissue.repo.dao;

import org.apache.catalina.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.StoreNews;

import java.util.List;


@Repository
public interface StoreNewsDao extends CrudRepository<StoreNews, Integer> {

    List<StoreNews> findAll();

    //根据发布人查询
    StoreNews findByFPubUser(String pubUser);


}
