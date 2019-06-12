package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.OrderInfo;

import java.util.List;

@Service
public interface OrderInfoService {


    List<OrderInfo> getListById(String userId);
}
