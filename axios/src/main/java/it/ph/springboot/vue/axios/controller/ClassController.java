package it.ph.springboot.vue.axios.controller;

import it.ph.springboot.vue.axios.model.ClassModel;
import it.ph.springboot.vue.axios.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("classController")
public class ClassController {
    @Autowired
    public IClassService classService;

    @GetMapping("/queryModel.do")
    public List<ClassModel> queryModel() {

        return classService.queryModel();
    }

    @PostMapping("/updateClassName.do")
    public void updateClassName(@RequestBody ClassModel cm) {
        classService.updetaClass(cm);
    }
    @GetMapping("/deletaClassId.do")
    public void deletaClassId(Integer id) {
        classService.deledaeClass(id);
        System.out.println("id:"+id);

    }


}
