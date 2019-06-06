package rongyan.rntissue.repo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.ProjectInfoDao;
import rongyan.rntissue.repo.entity.ProjectInfo;
import rongyan.rntissue.repo.service.ProjectInfoService;

import javax.transaction.Transactional;
import java.util.List;

@Service("ProjectInfoService")
@Transactional
public class ProjectInfoServiceImpl implements ProjectInfoService {


    @Autowired
    ProjectInfoDao projectInfoDao;

    @Override
    public List<ProjectInfo> findAllNotDelete() {
        return projectInfoDao.findAllByAndFIsDeleteEquals(1);
    }

    @Override
    public ProjectInfo findById(int id) {
        return projectInfoDao.findById(id);
    }

    @Override
    public List<ProjectInfo> findAll() {
        return projectInfoDao.findAll();
    }

    @Override
    public ProjectInfo findByFStateEquals(int state) {
        return projectInfoDao.findByFStateEquals(state);
    }
}
