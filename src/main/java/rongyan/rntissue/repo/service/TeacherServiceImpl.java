package rongyan.rntissue.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rongyan.rntissue.repo.dao.TeacherDao;
import rongyan.rntissue.repo.entity.Teacher;

import javax.transaction.Transactional;

/**
 * @author lixf
 * @date 2019/3/27
 */
@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher findTeacherByName(String name) {
        return teacherDao.findTeacher(name);
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
