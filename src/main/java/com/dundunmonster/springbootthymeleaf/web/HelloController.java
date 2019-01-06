    /*
     * 文件名: com.dundunmonster.springbootthymeleaf.web
     * 文件编号:
     * 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
     * 描述:
     * 创建人: ghaoxiang
     * 创建时间: 2019年01月06日 17:15
     * 修改人:
     * 修改时间: 2019年01月06日 17:15
     * 修改变更号:
     * 修改内容:
     */
    package com.dundunmonster.springbootthymeleaf.web;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.ModelMap;
    import org.springframework.web.bind.annotation.RequestMapping;

    /**
     * @author ghaoxiang
     * @version V1.0
     * @Title HelloController
     * @Description
     * @date 2019年01月06日 17:15
     * @since V1.0
     */
    @Controller
    public class HelloController {

        @RequestMapping("/")
        public String index(ModelMap map) {
            // 加入一个属性，用来在模板中读取
            map.addAttribute("host", "https://github.com/");
            // return模板文件的名称，对应src/main/resources/templates/index.html
            return "index";
        }

    }
