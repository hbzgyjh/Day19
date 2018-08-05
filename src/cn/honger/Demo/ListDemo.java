package cn.honger.Demo;

import java.util.ArrayList;
import java.util.List;

/*
 * List接口派系。继承Collection接口
 * 有很多实现类
 * List接口特点：有序、有索引、元素可重复
 * 实现类：ArrayList、linkedList
 * 
 * 
 * List接口中的抽象功能，有一部分与Collection一样,带索引的方法是自己的方法
 * 
 */
public class ListDemo {
		public static void main(String[] args) {
			function_2();
		}
		/*
		 * E set(int index,E)
		 * 修改指定位置的元素
		 * 返回被修改的元素
		 * 带有索引的操作，防止索引越界
		 */
		private static void function_2() {
			// TODO Auto-generated method stub
			List<Integer>  list = new ArrayList<Integer>();
						
						list.add(1);
						list.add(2);
						list.add(3);
						list.add(4);
						
						System.out.println(list);
						Integer i = list.set(0, 5);
						System.out.println(i);
						System.out.println(list);

		}
		/*
		 * remove(int Index)
		 * 移除指定位置的元素
		 * 返回被删除的元素
		 * 带有索引的操作，防止索引越界
		 */
		private static void function_1() {
			// TODO Auto-generated method stub
			List<Double>  list = new ArrayList<Double>();
			
			list.add(1.1);
			list.add(1.2);
			list.add(1.3);
			list.add(1.4);
			
			System.out.println(list);
			
			Double d = list.remove(0);
			System.out.println(d);
			System.out.println(list);
		}

		/*
		 * add(int index,  E)
		 * 将元素插入到元素的指定索引上
		 * 带有索引的操作，防止索引越界
		 */
		
		public static void function() {
			List<String> list = new ArrayList<String>();
			list.add("abc1");
			list.add("abc2");
			list.add("abc3");
			list.add("abc4");
			
			System.out.println(list);
			
			list.add(1, "hello");
			System.out.println(list);
		}
}
