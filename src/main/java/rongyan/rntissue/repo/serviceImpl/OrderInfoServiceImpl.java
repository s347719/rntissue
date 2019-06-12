package rongyan.rntissue.repo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.OrderInfoDao;
import rongyan.rntissue.repo.entity.OrderInfo;
import rongyan.rntissue.repo.service.OrderInfoService;

import javax.transaction.Transactional;
import java.util.List;

@Service("OrderInfoService")
@Transactional
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoDao orderInfoDao;

    @Override
    public List<OrderInfo> getListById(String userId) {
        return orderInfoDao.findAllByFuserId(userId);
    }
}
