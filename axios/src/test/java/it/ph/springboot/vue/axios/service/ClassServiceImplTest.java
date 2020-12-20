package it.ph.springboot.vue.axios.service;

import it.ph.springboot.vue.axios.AxiosApplication;
import it.ph.springboot.vue.axios.model.ClassModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {AxiosApplication.class})
class ClassServiceImplTest {
    @Autowired
    private ClassServiceImpl classServiceImpl;

    @Test
    void queryModel() {
        classServiceImpl.queryModel();
    }

    @Test
<<<<<<< HEAD
    void deledaeClass() {
        classServiceImpl.deledaeClass(1);
        //我也修改了代码
    }
=======
    void updetaClass() {
        ClassModel classModel = new ClassModel();
        classServiceImpl.updetaClass(classModel);
    }
    //我经行了修改了
>>>>>>> f042ff4a1fe435556e0050113403b1efef96060f
}