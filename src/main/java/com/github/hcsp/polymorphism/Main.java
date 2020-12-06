package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {
        // 创建了Sub()实例
        Base object = new Sub();
        // 绑定ParamSub()实例
        ParamSub param = new ParamSub();
        // 绑定到object，参数会自动转为ParamBase类型
        /*
         *  @Override
         *  public void print(ParamBase param) {
         *      System.out.println("I am Sub, the param is ParamBase");
         *  }
         */
        object.print(param);
    }
}
