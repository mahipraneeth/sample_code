package com.plugin.api;
import com.interfaces.PluginActionInterfaces;
import org.springframework.stereotype.Component;

@Component("sample_provider")
public class sample_provider implements PluginActionInterfaces {
    public static void main(String args[]){
        sample_provider obj = new sample_provider();
        obj.init("mahi");
        obj.add(1,3);
        obj.mul(2,3);
        obj.sub(5,3);
    }

    @Override
    public void init(String name) {
        System.out.println("hello "+name);

    }

    @Override
    public void add(int num1, int num2) {
        System.out.println(num1+num2);
    }

    @Override
    public void mul(int num1, int num2) {
        System.out.println(num1*num2);
    }

    @Override
    public void sub(int num1, int num2) {
        System.out.println(num1-num2);

    }

}
