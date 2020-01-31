/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.spring.study.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Introducer {

    @DeclareParents(value = "com.web.spring.study.aop2.Actor+",
            defaultImpl = TalkerImpl.class)
    public static Talker talk;
    
}
