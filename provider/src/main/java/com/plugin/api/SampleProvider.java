package com.plugin.api;
import com.interfaces.UtilityPluginInterface;

public class SampleProvider implements UtilityPluginInterface{
    /*public void start(){
        SampleProvider obj = new SampleProvider();
        obj.init("mahi");
        obj.add(1,3);
        obj.mul(2,3);
        obj.sub(5,3);
    }*/
    //SampleProvider obj=new SampleProvider();

    @Override
    public String init(String name) {
        return("hello "+name);

    }
    @Override
    public int add(int num1, int num2) {
        return (num1+num2);
    }
    @Override
    public int mul(int num1, int num2) {
        return(num1*num2);
    }
    @Override
    public int sub(int num1, int num2) {
        return(num1-num2);

    }

}
