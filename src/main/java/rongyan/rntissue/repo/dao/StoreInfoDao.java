package rongyan.rntissue.repo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.StoreInfo;

@Repository
public interface StoreInfoDao extends CrudRepository<StoreInfo, Integer> {

    /**根据id>0 来查找最顶上的数据
     */
    @Query("select s from StoreInfo s where s.fState=1 order by s.id DESC ")
    StoreInfo findDistinctTopByIdAfter();

}
