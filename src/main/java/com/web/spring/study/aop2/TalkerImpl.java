/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.spring.study.aop2;

/**
 *
 * @author student
 */
public class TalkerImpl implements Talker {
    @Override
    public void say() {
        System.out.println("脫口秀 say...");
    }
}
