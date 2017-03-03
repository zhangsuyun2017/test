package test;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {  
        // 创建集合对象  
        // 自然顺序进行排序  
        TreeSet<Object> ts = new TreeSet<Object>();  
  
        // 创建元素并添加  
        // 20,18,23,22,17,24,19,18,24  
        ts.add("b"); 
        ts.add("a");
        ts.add("A");
        ts.add("c");
        ts.add("20");  
        ts.add("18");  
  
        // 遍历  
        for (Object i : ts) {  
            System.out.println(i);  
        }  
    }  

}
