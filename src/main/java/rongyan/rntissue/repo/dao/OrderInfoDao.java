package rongyan.rntissue.repo.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rongyan.rntissue.repo.entity.OrderInfo;

import java.util.List;

@Repository
public interface OrderInfoDao extends PagingAndSortingRepository<OrderInfo, Integer> {

    List<OrderInfo> findAllByFuserId(String userId);

}
