package com.baidu.langshiquan.module;

/**
 * Created by langshiquan on 17/10/11.
 */
public class PluginTypeNode {

    // id，如果是-1，则无父结点。
    private Long id;
    // 父id
    private Long pid = -1l;
    // 插件类型名字
    private PluginDirType name = PluginDirType.OTHER;

    public PluginTypeNode(Long id, Long pid, PluginDirType name) {
        this.id = id;
        this.pid = pid;
        this.name = name;
    }

    public PluginTypeNode(Long id, PluginDirType name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public PluginDirType getName() {
        return name;
    }

    public void setName(PluginDirType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PluginType{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}
