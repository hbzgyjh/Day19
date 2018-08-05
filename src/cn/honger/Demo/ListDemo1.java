package cn.honger.Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/*
 * List的并发修改异常
 * java.util.ConcurrentModificationException
 * 遍历的过程中，修改了集合的长度，这是非法的
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals("abc3")) {
				list.add("ABC3");
			}
			System.out.println(s);
		}
		
	}
}
