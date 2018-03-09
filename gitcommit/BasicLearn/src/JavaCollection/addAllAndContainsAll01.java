package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/**
 * 测试Collection接口中与All有关的方法
 * boolean addAll(Collection<?extends E>c)
 * 						该方法需要我们传入一个集合，并且将该集合中所有的元素添加到当前集合中。如果此
 * 						Collection由于被调用而发生更改，则返回true
 * boolean containsAll(Collection<?>c)
 * 						该方法用于判断当前集合是否包含给定集合的所有元素，若包含则返回true
 * @author Feng
 *
 */
public class addAllAndContainsAll01 {

		/**
		 * c测试集合中与All相关的方法
		 * collection中有四个方法：c1.addAll(c2);c1.containsAll(c2)
		 *										c1.removeAll(c2);c1.retainAll(c2);
		 */
	//@Test
	public void testAll(){
		Collection<String> c1=new ArrayList<String>();
		c1.add("梅花3");c1.add("红桃6");
		c1.add("黑桃2");c1.add("大王");
		Collection<String> c2=new ArrayList<String>();
		c2.add("红桃3");c2.add("方块3");
		c2.add("黑桃3");c2.add("小王");
		c2.addAll(c1);//不用变量接住，不会产生新的集合，直接在原来集合上添加
		/*结论两个集合的拼接直接修改a2集合对象的数组
		 * 不会创建新的集合*/
		System.out.println(c2);
		/*需求：判断集合中是否包含王炸；同时包含大小王
		 * 	只要同时判断多个元素时，
		 * 1：先将要判断的元素放入另外一个集合中
		 * 2：将两个集合在进行比较
		 * */
		Collection<String> wz=new ArrayList<String>();
		wz.add("大王");wz.add("小王");
		System.out.println(c2.containsAll(wz)?"有王炸":"没有王炸");
		
	}
	
	
	/**retainAll:获的两个集合的公共部分，也叫交集
	 * removeAll:获得两个集合的差集
	 *
	 * 强调：两个方法都会直接修改原来集合对象，小心使用
	 * 其实，两个方法执行的都是从集合中批量删除多个元素的操作，只不过：
	 * 			retainAll方法删除的是两个集合中不同的元素
	 * 			removeAll方法删除的是两个集合相同的元素
	 */
	/**
	 * 求两个集合的交集和差集
	 */
	@Test
	public void batchRemoveTest(){
		Collection<String> mine=new ArrayList<String>();
		mine.add("大黄蜂");
		mine.add("救护车");
		mine.add("擎天柱");
		System.out.println("我家的："+mine);
		Collection<String> others=new ArrayList<String>();
		others.add("擎天柱");
		others.add("大黄蜂");
		others.add("铁皮");
		others.add("威震天");
		System.out.println("别人的："+others);
		mine.retainAll(others);
		System.out.println("我家有别人也有的："+mine);
		//结论：原来的mine集合中的救护车会被删除，找不回来
		//		求交集，调用对象和参数对象的顺序不会影响结果
		others.removeAll(mine);
		System.out.println("别人有："+others+",但我没有！");
		//结论：求两个集合差集，谁调用removeAll方法，就会保留谁中的差集元素
		//		作为参数的集合，仅作为比较，不会保留有任何的修改
	}
}
