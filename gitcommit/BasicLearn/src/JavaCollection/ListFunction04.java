package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * List接口的七个方法：
 *  	1：	public void add(int index,E element);				插入到指定位置，原位置之后的元素都顺序往后移动一个
 *      2：  public boolean addAll(int index,Collection<? Extends E>c);
 *      3:    public E get(int index);
 *      4:    public int indexOf(Object o);
 *      5:    public int lastIndexOf(Object o);
 *      6:    public E  remove(int index);				删除指定位置的元素，并且将指定的元素返回
 *      7:    public E  set(int index,E element);
 *      8:   List<E> sublist(int fromIndex,int toIndex);截取子字符串，含头不含尾，但其集合是在原集合上进行操作，并没有进行创建集合
 *		9:   Object toArray() <T> T[]toArray(T[] a);集合转换为数组，实际上是调用collection中定义的，所有集合都有这个功能
 *		10：static <T>List<T>asList(T...a);将数组转化为集合
 */
public class ListFunction04 {
	/**
	 * 测试add(int index,E element)和remove（int ）；
	 */
	//@Test
	public void addAndRemoveTest(){
		List<String> linked=new LinkedList<String>();
		linked.add("大伟哥");
		linked.add("肖凡林");
		linked.add("大鹏"); 
		System.out.println(linked);
		linked.add(1, "她");
		String str=linked.remove(1);
		System.out.println(linked);
		System.out.println(str);
		System.out.println(linked);
		/**
		 * 结论：ArrayList：将当前位置之后的所有元素迁移一个元素，效率低下
		 * 			LinkedList：不需要移动元素，只需要修改指针
		 * 
		 */
	}
	
	
	/**
	 * 测试subList
	 */
	//@Test
	public void subListTest(){
		List<String> cards=new ArrayList<String>();
		cards.add("大王");
		cards.add("黑桃2");
		cards.add("方片2");
		cards.add("红桃2");
		cards.add("梅花2");
		cards.add("小王");
		System.out.println("手里的牌"+cards);
		List<String> bong=cards.subList(1, 4+1);
		System.out.println("炸："+bong);
		bong.clear();
		System.out.println("手里的牌"+cards);
		/*
		 * 结论：修改子集合，源集合也会被改变；子集合只是在源集合上加了一个下表索引，并没有创建新集合
		 */
	}
	
	/**
	 * 测试集合转换为数组的方法
	 */
	@Test
	public void toArrayTest(){
		Collection<String> to=new LinkedList<String>();
		for(int i=0;i<4;i++){
			to.add("苹果");
		}
		//Step1:篮子可以放下所有苹果
		String[] basket6=new String[6];
		to.toArray(basket6);
		System.out.println(Arrays.toString( basket6));
		//结论：如果数组可以放得下所有元素，直接修改元素组，不会创建新数组
		//step2:
		String[] basket2=new String[2];
		String[] newbasket=to.toArray(basket2);
		System.out.println(Arrays.toString( newbasket));
		//如果数组放不下所有集合元素，就会抛弃旧数组，创建新数组，返回新数组对象
		//    必须用变量接住返回的新数组
		//step3;
		String[] newbasket1=to.toArray(new String[]{});
		System.out.println("newbasket:"+Arrays.toString(newbasket1));
		//通用做法：不必关心集合中的元素个数以及数组长度
		//step4:
		String[] mybasket=to.toArray(new String[to.size()]);
		System.out.println("mybasket:"+Arrays.toString(mybasket));
		//优化做法：不存在抛弃数组，创建新数组的情况
	}
	/**
	 * 测试将数组转化为集合的方法
	 */
	@Test
	public void asListTest(){
		String[] money={"100","100","假100","100"};
		//数组集合：Arrays.asList(money);
		//情况一：返回一个不能删除和添加元素的集合，几何与数组共享同一个数组对象存储空间
	  //List<String > n=Arrays.asList(money);
		//情况二：获得一个可以任意修改的集合对象
		//step1:新建一个标准的ArrayList对象
		List<String> n=new ArrayList<String>();
		//step2:使用集合对象的addAll方法批量拷贝asList方法的集合中的所有元素到新集合对象中
		n.addAll(Arrays.asList(money));
		System.out.println("集合对象："+n);
		for(int i=0;i<n.size();i++){//size()元素个数
			//如果发现假币就替换为真100
			if(!n.get(i).equals("100")){
				System.out.println("发现假100");
				//需求1：发现假币就替换真币
				//n.set(i, "100");
				//需求2：发现假币，就删除该假币
				n.remove(i);//报错：不支持的操作！
			}
		}
		System.out.println("数组对象："+Arrays.toString(money));
		System.out.println("集合对象："+n);
		//结论:将数组转换为集合，在对集合进行操作也会改变原数组中元素
		//		转后的集合对象和原数组对象其实共享同一个数组存储空间
		//        转换后的数组，不支持添加（add）和删除（remove）元素的操作
	}
}
