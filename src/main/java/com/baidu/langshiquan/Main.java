package com.baidu.langshiquan;

import java.util.ArrayList;
import java.util.List;

import com.baidu.langshiquan.module.PluginDirType;
import com.baidu.langshiquan.module.PluginTypeNode;

/**
 * Created by langshiquan on 17/10/11.
 */
public class Main {
    public static void main(String[] args) {
        List<PluginTypeNode> list = new ArrayList<PluginTypeNode>();
        PluginTypeNode compile = new PluginTypeNode(1l, PluginDirType.COMPILE);
        PluginTypeNode test = new PluginTypeNode(2l, PluginDirType.TEST);
        PluginTypeNode c_compileWithCloud = new PluginTypeNode(3l, 1l, PluginDirType.COMPILE_WITH_BCLOUD);
        PluginTypeNode c_unitTest = new PluginTypeNode(4l, 1l, PluginDirType.UNIT_TEST);
        PluginTypeNode t_compileWithCloud = new PluginTypeNode(3l, 2l, PluginDirType.COMPILE_WITH_BCLOUD);

        // add
        list.add(compile);
        list.add(test);
        list.add(c_compileWithCloud);
        list.add(c_unitTest);
        list.add(t_compileWithCloud);

        System.out.println(list);
    }
}
