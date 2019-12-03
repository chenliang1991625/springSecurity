package com.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author Administrator
 * @version 1.0
 **/
//springSecuritiy的初始化器
public class SpringSecurityApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {
    public SpringSecurityApplicationInitializer() {
        //super(WebSecurityConfig.class);
    }
}
