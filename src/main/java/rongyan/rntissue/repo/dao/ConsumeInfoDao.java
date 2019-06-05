package rongyan.rntissue.repo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.ConsumeInfo;

import java.util.List;

@Repository
public interface ConsumeInfoDao extends CrudRepository<ConsumeInfo, Integer> {

    //通过表中id 查询唯一的数据
    ConsumeInfo findById(int id);

//    筛选所有有效的消费订单
    List<ConsumeInfo> findAllByFIsDeleteIsOrderByIdDesc(int delete);

    List<ConsumeInfo> findAllByFUserID(String userTel);
}
