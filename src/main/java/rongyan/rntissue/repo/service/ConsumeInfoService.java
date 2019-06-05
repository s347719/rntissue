package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.ConsumeInfo;

import java.util.List;

@Service
public interface ConsumeInfoService {

    ConsumeInfo getOne(int id);

    List<ConsumeInfo> findAll();

    List<ConsumeInfo> findAllByuserTel(String userTel);
}
