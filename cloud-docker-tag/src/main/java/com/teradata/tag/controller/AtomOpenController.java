package com.teradata.tag.controller;

import com.netflix.discovery.converters.Auto;
import com.teradata.tag.bean.BizAtomExtDef;
import com.teradata.tag.bean.SysUserVO;
import com.teradata.tag.repository.AtomOpenService;
import com.teradata.tag.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xuyaohui
 * @date 2018/7/27 0027 上午 10:59
 */
@RestController
public class AtomOpenController {

    @Autowired
    private AtomOpenService atomOpenService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getAtomDetil")
    public String getAtomDetil(){

        String test="70230";
        String[] temp = test.split("#");
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId","xuxinli");
        List<SysUserVO> result = userRepository.getUserByUserId(map);

        return result.get(0).toString();
    }
}