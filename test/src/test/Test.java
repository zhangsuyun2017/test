package test;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {  
        // �������϶���  
        // ��Ȼ˳���������  
        TreeSet<Object> ts = new TreeSet<Object>();  
  
        // ����Ԫ�ز����  
        // 20,18,23,22,17,24,19,18,24  
        ts.add("b"); 
        ts.add("a");
        ts.add("A");
        ts.add("c");
        ts.add("20");  
        ts.add("18");  
  
        // ����  
        for (Object i : ts) {  
            System.out.println(i);  
        }  
    }  

}
