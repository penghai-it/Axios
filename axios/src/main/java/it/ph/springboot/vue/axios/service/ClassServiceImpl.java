package it.ph.springboot.vue.axios.service;

import it.ph.springboot.vue.axios.dao.ClassModelMapper;
import it.ph.springboot.vue.axios.model.ClassModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private ClassModelMapper classModelMapper;

    @Override
    public List<ClassModel> queryModel() {

        return classModelMapper.findClassModel();
    }

    @Override
    public int updetaClass(ClassModel cm) {
        return classModelMapper.updateByPrimaryKeySelective(cm);
    }

    @Override
    public int deledaeClass(Integer id) {
        return classModelMapper.deleteByPrimaryKey(id);
    }


}
