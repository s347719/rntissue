package rongyan.rntissue.repo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.Card;

import java.util.List;

@Repository
public interface CardDao extends PagingAndSortingRepository<Card, Integer> {


    //根据关联id查找所有属于他的卡，根据是否领取排序
    @Query("SELECT c from Card c where c.fUserID= ?1 order by c.fIsUsed DESC ")
    List<Card> findAllByFUserIDEqualsOrderByFIsUsedDesc(String tell);


    //根据卡号查找
    Card findFirstByFVipCardNo(String num);


}
