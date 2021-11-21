package com.interfaces;


import org.springframework.stereotype.Component;

@Component
public interface PluginActionInterfaces {
    public void init(String name);
    public void add(int num1,int num2);
    public void mul(int num1,int num2);
    public void sub(int num1,int num2);
}
