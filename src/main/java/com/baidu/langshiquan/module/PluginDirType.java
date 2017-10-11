package com.baidu.langshiquan.module;

/**
 * Created by langshiquan on 17/10/11.
 */
public enum PluginDirType {
    // 业务上的一级目录
    COMPILE("编译"), TEST("测试"), RELEASE("发布"), DEPLOY("部署"), OTHER("其他"),
    // 业务上的二级目录
    COMPILE_WITH_BCLOUD("云端编译和打包"), UNIT_TEST("Unit Test");
    private String name;

    PluginDirType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

