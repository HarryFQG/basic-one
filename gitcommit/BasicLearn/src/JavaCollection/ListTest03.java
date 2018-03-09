package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * List类型的测试
 * @author Feng
 *有七个方法
 */
public class ListTest03 {
	/**
	 * List 类型的测试方法
	 */
	@Test
	public void testList(){
		List<String> array=new ArrayList<String>();
		List<String> linked=new LinkedList<String>();
		array.add("女汉子");
		array.add("你");
		array.add("学妹");
		System.out.println(array);
		String str=array.get(1);
		System.out.println("读指定位置："+str);
		array.set(2,"大鹏");
		System.out.println("更改指定位置后数组："+array);
		//换座位：1和2位置换
		str =array.get(1);
		array.set(1,array.get(2) );
		array.set(2, str);
		System.out.println("换座位后："+array);
		/*array.add(1, "我");
		System.out.println(array);
		linked.add("大伟哥");
		linked.add("肖凡林");
		linked.add("大鹏");
		System.out.println(linked);
		linked.add(1, "她");
		System.out.println(linked);*/
	}
}
/**
 * 结论：ArrayList和LinkedList功能上完全一样
 * 				因为都是实现List接口
 *           ArrayList在查找指定位置上元素更高效
 */
/**
 * List接口的七个方法：
 *  	1：	public void add(int index,E element);
 *      2：  public boolean addAll(int index,Collection<? Extends E>c);
 *      3:    public E get(int index);
 *      4:    public int indexOf(Object o);
 *      5:    public int lastIndexOf(Object o);
 *      6:    public E  remove(int index);
 *      7:    public E  set(int index,E element);
 */
