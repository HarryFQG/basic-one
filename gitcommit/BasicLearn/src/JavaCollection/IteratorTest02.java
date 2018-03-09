package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/**
 * 迭代器用于遍历集合元素。获取迭代器可以使用Collection定义的方法：Iterator iterator()
 * 迭代器Itreator是一个接口，集合再重写Collection的iterator()方法时利用内部类提供的迭代器的实现；
 * 迭代器提供了统一的遍历集合元素的方法，其提供了用于遍历集合的两个方法：
 * 		boolean hasNext():判断集合是否还有元素可以遍历。
 * 		E next():返回迭代的下一个元素 
 * @author Feng
 *
 */
public class IteratorTest02 {

	/**
	 * 测试集合对象的迭代器的hasNext、next、remove方法
	 */
	//@Test
	public void IteratorTest(){
		//4张100元钞票，有一张假币
		Collection<String> money=new ArrayList<String>();
		money.add("100");
		money.add("100");
		money.add("假100");
		money.add("100");
		System.out.println(money);
		int sum=0;//保存钱数
		//1.只要遍历集合的每个元素就要使用迭代器
		//2.只要使用迭代器，必须从集合对象的Iterator方法获得
		
		Iterator<String> it=money.iterator();
		/*迭代器使用的固定方法：
		 *  while循环：条件：是否有下一个元素
		 *  		循环体：使用next方法向后移动一个元素位置，
		 *  							并取出新元素进行操作
		 */
	while(it.hasNext()){
		//迭代器的起始位置在第一个元素之前，
		//所以：在使用之前 必须点调用next方法，在处理
		String s=it.next();
		if(s.equals("100")){
			sum+=Integer.parseInt(s);
		}else{
			System.out.println("发现假100");
			//money.remove("假100");
			it.remove();//集合对象remove方法要传参数,迭代器的remove方法不用传参数
			System.out.println(money);
			/**问题：少数100元
			 * 集合对象的remove方法会跳过下一个元素
			 * 而迭代器的remove方法不会跳过，它会先后退一个元素位置在向下遍历
			 *结论：一般不要轻易更改集合中的元素个数，要更改就通过迭代器中的remove方法，就不会遍历漏掉元素
			 */
		}
	}
	System.out.println("共有"+sum+"元");	
		
	}
	
	/**
	 *测试 增强for循环
	 */
	/*应用场景：只适用于遍历集合或数组
	 * for(元素类型 e  ：数组或集合){
	 *      循环体；
	 *      }
	 */
	@Test
	public void forTest(){
		Collection<String> money=new ArrayList<String>();
		money.add("100");
		money.add("100");
		money.add("假100");
		money.add("100");
		System.out.println(money);
		int sum=0;
		for(String str:money){
			if(str.equals("100")){
				sum+=Integer.parseInt(str);
			}
			//增强for循环中不能删除集合的元素
			//要删除元素，只能自己编写迭代器，然后调用迭代器的remove方法
		}
		System.out.println("共"+sum+"元");
	}
	
}
