package com.yss;

import org.apache.tomcat.util.descriptor.InputSourceUtil;
import sun.misc.PostVMInitHook;

/**
 * @ProjectName: demo01
 * @Package: com.yss
 * @ClassName: DemoJVM
 * @Description: 理解jvm相关知识,
 * 结合javap 查看字节码指令，jclasslib查看栈帧中局部变量表等信息
 * @Author: 汤本辉
 * @CreateDate: 2020-04-11 12:36
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-04-11 12:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class DemoJVM {
    public static void main(String[] args) {
        int j =0;
        for(int i=0;i<10;i++){
                j=j++;
        }
        int k=9;
        int m =9;
        int d =9;
        int c=9;
        d++;
        ++c;
        System.out.println("d>>>>"+d);
        System.out.println("c>>>>"+c);
        System.out.println("k++>>>"+ k++);
        System.out.println("++m>>>"+ ++m);
        System.out.println("k>>>"+k);
        System.out.println("m>>>>"+m);
        System.out.println("j>>>"+j);
    }
}