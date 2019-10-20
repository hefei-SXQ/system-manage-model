package com.sxq.controller.activiti;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @Auther sun
 * @Date 2019/10/20 11:03
 * @Discription 流程模型管理
 */
@RequestMapping("/act")
@RestController
public class ActModuleController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private RepositoryService rs;
    @Autowired
    private RuntimeService ru;

    /**
     * 新增流程模型的方法
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value="/newModel",method = RequestMethod.POST)
    public Object newModel() throws UnsupportedEncodingException {
        //初始化一个空模型
        Model model = rs.newModel();

        String name = "process1";
        String description = "another process";
        int version = 1;
        String key = "process1";
        ObjectNode modelNode = objectMapper.createObjectNode();
        modelNode.put(ModelDataJsonConstants.MODEL_NAME, name);
        modelNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, description);
        modelNode.put(ModelDataJsonConstants.MODEL_REVISION, version);

        model.setName(name);
        model.setKey(key);
        model.setMetaInfo(modelNode.toString());

        rs.saveModel(model);
        String id = model.getId();

        //完善modelEditSource
        ObjectNode editerNode = objectMapper.createObjectNode();
        editerNode.put("id", "canvas");
        editerNode.put("resourceId","canvas");
        ObjectNode stencilSetNode = objectMapper.createObjectNode();
        stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
        editerNode.set("stencilSet", stencilSetNode);
        rs.addModelEditorSource(id, editerNode.toString().getBytes("utf-8"));

        return id;
    }

    @RequestMapping("draw")
    public void draw(){

    }
}
