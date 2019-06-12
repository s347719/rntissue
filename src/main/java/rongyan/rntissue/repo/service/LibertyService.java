package rongyan.rntissue.repo.service;

import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.entity.Liberty;

@Service
public interface LibertyService {


    Liberty getLibertybyId(int id);
}
