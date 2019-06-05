package rongyan.rntissue.repo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.StoreInfo;

@Repository
public interface StoreInfoDao extends CrudRepository<StoreInfo, Integer> {

    /**根据id>0 来查找最顶上的数据
     */
    StoreInfo findDistinctTopByIdAfter(int i);

}
